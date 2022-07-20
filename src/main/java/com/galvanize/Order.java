package com.galvanize;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Order {
    // encapsulation: the fields below should not be public
    public ArrayList<Object> items = new ArrayList<>();
    public BigDecimal total = new BigDecimal("0.00");

    // the method below is a good candidate for subtype polymorphism - avoid the if >> create type Order
    void addItem(Object item) {
        items.add(item);
        if (item instanceof Lease) {
            Lease lease = (Lease) item;
            total = total.add(lease.pricePerMonth.multiply(BigDecimal.valueOf(lease.numberOfMonths)));
        }
        else if (item instanceof Purchase) {
            total = total.add(((Purchase) item).price);
        }
        else if (item instanceof Rental) {
            Rental rental = (Rental) item;
            long days = LocalDateTime.now().until(rental.endDate, ChronoUnit.DAYS) + 1;
            total = total.add(rental.rentalPricePerDay.multiply(BigDecimal.valueOf(days)));
        }
    }

    public BigDecimal getTotal() {
        return total;
    }
}
