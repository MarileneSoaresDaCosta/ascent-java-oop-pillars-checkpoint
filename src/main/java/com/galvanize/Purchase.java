package com.galvanize;

import java.math.BigDecimal;

public class Purchase extends OrderType{

    private BigDecimal price;
    private String productName;

    public Purchase(String productName, BigDecimal price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }

    @Override
    public BigDecimal totalPrice() {
        return this.price;
    }
}
