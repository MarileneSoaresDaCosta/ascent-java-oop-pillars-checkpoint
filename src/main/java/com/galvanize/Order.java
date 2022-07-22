package com.galvanize;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Order {

    protected ArrayList<Object> items = new ArrayList<>();
    protected BigDecimal total = new BigDecimal("0.00");

    void addItem(OrderType item) {
        items.add(item);
        total = total.add(item.totalPrice());
    }

    public BigDecimal getTotal() {
        return total;
    }

    public ArrayList<Object> getItems() {
        ArrayList<Object> itemList = new ArrayList<>(this.items);
        return itemList;
    }
}

