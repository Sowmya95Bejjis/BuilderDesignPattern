package com.foodDeliverySystem.designPattern;
import java.util.List;

public class OrderDetails {
    /**
     * 1. A private constructor is created, so that it cannot be accessed from the outside of the class.
     *    This makes it impossible to create an orderDetails instance directly. The object creation process is delegated to the Builder class.
     * 2. Builder instance is passed as a parameter to the constructor, which contains all the values to be set.
     * 3. Builder class contains the same fields as the orderDetails class, which is necessary to hold the values to be passed to the private constructor.
     *    This has often been rightly criticized as code duplication.
     * 4. For every optional field to be set, the Builder class exposes a setter-like method, which assigns the field’s value and returns the current Builder instance.
     *    Since each method call returns the same Builder instance, method calls can be chained, which makes the client code more concise and readable.
     * 5. The build method calls the private constructor by passing the current Builder instance as the only parameter.
     *    The values held by the Builder instance are then unpacked by the constructor, which assigns them to the corresponding orderDetails data members.
     */

    private String orderId;
    private String restaurantName;
    private List<String> itemIds;
    private Enum orderStatus;
    private Integer totalAmount;
    private PaymentInfo paymentDetails;
    private Address deliveryAddress;
    private User deliveryAgent;
    private Tracker liveTracker;

    public OrderDetails(Builder builder) {
        this.orderId = builder.orderId;
        this.restaurantName = builder.restaurantName;
        this.itemIds = builder.itemIds;
        this.orderStatus = builder.orderStatus;
        this.totalAmount = builder.totalAmount;
        this.paymentDetails = builder.paymentDetails;
        this.deliveryAddress = builder.deliveryAddress;;
        this.deliveryAgent = builder.deliveryAgent;
        this.liveTracker = builder.liveTracker;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public List<String> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<String> itemIds) {
        this.itemIds = itemIds;
    }

    public Enum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Enum orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public PaymentInfo getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentInfo paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public User getDeliveryAgent() {
        return deliveryAgent;
    }

    public void setDeliveryAgent(User deliveryAgent) {
        this.deliveryAgent = deliveryAgent;
    }

    public Tracker getLiveTracker() {
        return liveTracker;
    }

    public void setLiveTracker(Tracker liveTracker) {
        this.liveTracker = liveTracker;
    }

    public static class Builder {
        private String orderId;
        private String restaurantName;
        private List<String> itemIds;
        private Enum orderStatus;
        private Integer totalAmount;
        private PaymentInfo paymentDetails;
        private Address deliveryAddress;
        private User deliveryAgent;
        private Tracker liveTracker;

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder restaurantName(String restaurantName) {
            this.restaurantName = restaurantName;
            return this;
        }

        public Builder itemIds(List<String> itemIds) {
            this.itemIds = itemIds;
            return this;
        }

        public Builder orderStatus(Enum orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        public Builder totalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Builder paymentDetails(PaymentInfo paymentDetails) {
            this.paymentDetails = paymentDetails;
            return this;
        }
        public Builder deliveryAddress(Address deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }
        public Builder deliveryAgent(User deliveryAgent) {
            this.deliveryAgent = deliveryAgent;
            return this;
        }

        public Builder liveTracker(Tracker liveTracker) {
            this.liveTracker = liveTracker;
            return this;
        }

        public OrderDetails build() {
            return new OrderDetails(this);
        }
    }
}
