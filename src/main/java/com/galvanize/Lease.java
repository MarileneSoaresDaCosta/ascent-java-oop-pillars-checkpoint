package com.galvanize;

import java.math.BigDecimal;

// inheritance & poly: Lease should extend order
public class Lease extends Order {
    // encapsulation: restrict visibility of fields
    private BigDecimal pricePerMonth;
    private int numberOfMonths;
    private String licensePlate;

    // constructor
    public Lease(String licensePlate, BigDecimal pricePerMonth, int numberOfMonths) {
        this.licensePlate = licensePlate;
        this.pricePerMonth = pricePerMonth;
        this.numberOfMonths = numberOfMonths;
    }
    // add method to calculate total
    @Override
    public BigDecimal totalPrice(){
        return this.pricePerMonth.multiply(BigDecimal.valueOf(this.numberOfMonths));
    }

    @Override
    public String toString() {
        return "Lease{" +
                "pricePerMonth=" + pricePerMonth +
                ", numberOfMonths=" + numberOfMonths +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
