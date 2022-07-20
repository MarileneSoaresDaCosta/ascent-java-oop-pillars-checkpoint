package com.galvanize;

import java.math.BigDecimal;
// inheritance & poly: Purchase should extend order
public class Purchase {
    // encapsulation: restrict visibility of fields
    public BigDecimal price;
    public String productName;

    // constructor
    public Purchase(String productName, BigDecimal price) {
        this.productName = productName;
        this.price = price;
    }

    // add method to calculate total

    @Override
    public String toString() {
        return "Purchase{" +
                "price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }
}
