package com.galvanize;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Rental extends OrderType{

    private BigDecimal rentalPricePerDay;
    private LocalDateTime endDate;

    public Rental(BigDecimal rentalPricePerDay, LocalDateTime endDate) {
        this.rentalPricePerDay = rentalPricePerDay;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "rentalPricePerDay=" + rentalPricePerDay +
                ", endDate=" + endDate +
                '}';
    }

    @Override
    public BigDecimal totalPrice() {
        long days = LocalDateTime.now().until(this.endDate, ChronoUnit.DAYS) + 1;
        return this.rentalPricePerDay.multiply(BigDecimal.valueOf(days));
    }
}

