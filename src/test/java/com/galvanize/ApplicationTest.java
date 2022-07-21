package com.galvanize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class ApplicationTest {

    @Test
    public void passes() {
        Lease lease = new Lease("XVB-104", new BigDecimal("3.05"), 6);
        assertEquals("Lease{pricePerMonth=3.05, numberOfMonths=6, licensePlate='XVB-104'}", lease.toString());

        Purchase purchase = new Purchase("Phone Case", new BigDecimal("7.88"));
        assertEquals("Purchase{price=7.88, productName='Phone Case'}", purchase.toString());

        Rental rental = new Rental(new BigDecimal("12.44"), LocalDateTime.now().plus(Duration.ofDays(5)));
        assertEquals(true, rental.toString().contains("rentalPricePerDay=12.44"));

        // once Order is abstract, we won't need the line below
//        Order order = new Order();

        assertEquals(0, Order.getItems().size());
        assertEquals(new BigDecimal("0.00"), Order.getTotal());

        Order.addItem(lease);
        assertEquals(1,Order.getItems().size());
        assertEquals(new BigDecimal("18.30"), Order.getTotal());

        Order.addItem(purchase);
        assertEquals(2, Order.getItems().size());
        assertEquals(new BigDecimal("26.18"), Order.getTotal());

        Order.addItem(rental);
        assertEquals(3, Order.getItems().size());
        assertEquals(new BigDecimal("88.38"), Order.getTotal());
    }

}
