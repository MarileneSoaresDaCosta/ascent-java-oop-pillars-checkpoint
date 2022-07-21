package com.galvanize;

import java.math.BigDecimal;
// inheritance & poly: Purchase should extend order
public class Purchase extends Order {
    // encapsulation: restrict visibility of fields
    private BigDecimal price;
    private String productName;

    // constructor
    public Purchase(String productName, BigDecimal price) {
        this.productName = productName;
        this.price = price;
    }

    // add method to calculate total
    @Override
    public BigDecimal totalPrice(){
        return this.price;
    }


    @Override
    public String toString() {
        return "Purchase{" +
                "price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }
}
