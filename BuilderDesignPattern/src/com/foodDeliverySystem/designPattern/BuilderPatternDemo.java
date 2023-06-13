package com.foodDeliverySystem.designPattern;
import java.util.Arrays;

public class BuilderPatternDemo {
    /**
     * This project is used to demonstrate the Joshua Bloch’s Builder design pattern - this version of the Builder pattern provides a simple and
     * safe way to build objects that have many optional parameters, and finally addressing the telescoping constructor problem
     * Bloch’s Builder pattern is shorthand for the GoF’s counterpart in the sense that it consists of
     * only two of the four components: the ConcreteBuilder and the Product
     *
     * In our food delivery application, this pattern is used to construct the OrderDetails object which has n number of variables (few being optional and few being mandatory)
     *
     */
    public static void main(String[] args) {

        OrderDetails orderDetails = new OrderDetails.Builder()
                .orderId("123")
                .restaurantName("ABC")
                .itemIds(Arrays.asList("A", "B"))
                .build();

        System.out.println("Checking the orderDetails for the order " + orderDetails.getOrderId());
    }
}