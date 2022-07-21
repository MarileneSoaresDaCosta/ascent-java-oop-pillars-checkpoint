package com.galvanize;

//import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//this class should extend Order
public class Rental extends Order {
    // encapsulation: restrict visibility of fields
    private final BigDecimal rentalPricePerDay;
    private final LocalDateTime endDate;

    public Rental(BigDecimal rentalPricePerDay, LocalDateTime endDate) {
        this.rentalPricePerDay = rentalPricePerDay;
        this.endDate = endDate;
    }
    // add method for calculation of total
    public BigDecimal totalPrice(){
        long days = LocalDateTime.now().until(this.endDate, ChronoUnit.DAYS) + 1;
        return this.rentalPricePerDay.multiply(BigDecimal.valueOf(days));
    }


    @Override
    public String toString() {
        return "Rental{" +
                "rentalPricePerDay=" + rentalPricePerDay +
                ", endDate=" + endDate +
                '}';
    }
}
