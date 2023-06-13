package com.foodDeliverySystem.designPattern;
public class PaymentInfo {

    private Enum paymentMethod;

    private String paymentStatus;

    private String paymentId;

    public Enum getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Enum paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}
