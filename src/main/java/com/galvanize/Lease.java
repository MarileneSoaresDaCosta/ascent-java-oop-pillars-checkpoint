package com.galvanize;

import java.math.BigDecimal;

// inheritance & poly: Lease should extend order
public class Lease {
    // encapsulation: restrict visibility of fields
    public BigDecimal pricePerMonth;
    public int numberOfMonths;
    public String licensePlate;

    // constructor
    public Lease(String licensePlate, BigDecimal pricePerMonth, int numberOfMonths) {
        this.licensePlate = licensePlate;
        this.pricePerMonth = pricePerMonth;
        this.numberOfMonths = numberOfMonths;
    }

    // add method to calculate total
    @Override
    public String toString() {
        return "Lease{" +
                "pricePerMonth=" + pricePerMonth +
                ", numberOfMonths=" + numberOfMonths +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
