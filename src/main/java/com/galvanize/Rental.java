package com.galvanize;

import java.math.BigDecimal;
import java.time.LocalDateTime;
//this class should extend Order
public class Rental {
    // encapsulation: restrict visibility of fields
    public BigDecimal rentalPricePerDay;
    public LocalDateTime endDate;

    public Rental(BigDecimal rentalPricePerDay, LocalDateTime endDate) {
        this.rentalPricePerDay = rentalPricePerDay;
        this.endDate = endDate;
    }
    // add method for calculation of total

    @Override
    public String toString() {
        return "Rental{" +
                "rentalPricePerDay=" + rentalPricePerDay +
                ", endDate=" + endDate +
                '}';
    }
}
