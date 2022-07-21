package com.galvanize;

import java.math.BigDecimal;
import java.util.ArrayList;
// this class should be abstract. Only usages on test to check number of items
public abstract class Order {
    // encapsulation: the fields below should not be public
    protected static ArrayList<Object> items = new ArrayList<>();
    protected static BigDecimal total = new BigDecimal("0.00");

    // the method below is a good candidate for subtype polymorphism - avoid the if >> create type Order
    // in the subclasses, and Order could be made abstract
    public static void addItem(Order item) {
        // stays the same
         items.add(item);
        // this changes to calling Order.totalPrice()
        total = total.add(item.totalPrice());
//        if (item instanceof Lease) {
//            Lease lease = (Lease) item;
//            total = total.add(lease.pricePerMonth.multiply(BigDecimal.valueOf(lease.numberOfMonths)));
//        }
//        else if (item instanceof Purchase) {
//            total = total.add(((Purchase) item).price);
//        }
//        else if (item instanceof Rental) {
//            Rental rental = (Rental) item;
//            long days = LocalDateTime.now().until(rental.endDate, ChronoUnit.DAYS) + 1;
//            total = total.add(rental.rentalPricePerDay.multiply(BigDecimal.valueOf(days)));
//        }
    }

    // calculate order total >>  abstract method >> changed according to context - tests require name "totalPrice"
    public abstract BigDecimal totalPrice();

    // we'll need a getter for items and one for total
    public static BigDecimal getTotal() {
        return total;
    }

    public static ArrayList<Object> getItems(){
        ArrayList<Object> copyOfItems = new ArrayList<>(items);
        return copyOfItems;
    }
}
