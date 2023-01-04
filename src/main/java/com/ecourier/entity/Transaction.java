package com.ecourier.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long transactionId;
private long customerId;
private long trackingNumber;
private double amount;
private PaymentStatus status;
private PaymentMethod method;


public Transaction(long transactionId, long customerId, long trackingNumber, double amount, PaymentStatus status,
        PaymentMethod method) {
    super();
    this.transactionId = transactionId;
    this.customerId = customerId;
    this.trackingNumber = trackingNumber;
    this.amount = amount;
    this.status = status;
    this.method = method;
}
public PaymentMethod getMethod() {
    return method;
}
public void setMethod(PaymentMethod method) {
    this.method = method;
}
public long getTransactionId() {
    return transactionId;
}
public void setTransactionId(long transactionId) {
    this.transactionId = transactionId;
}
public long getCustomerId() {
    return customerId;
}
public void setCustomerId(long customerId) {
    this.customerId = customerId;
}
public long getTrackingNumber() {
    return trackingNumber;
}
public void setTrackingNumber(long trackingNumber) {
    this.trackingNumber = trackingNumber;
}
public void setStatus(PaymentStatus status) {
    this.status=status;
}
public double getAmount() {
    return amount;
}
public void setAmount(double amount) {
    this.amount = amount;
}
public PaymentStatus getStatus() {
    return status;
}
public Transaction() {
    super();
    // TODO Auto-generated constructor stub
}


 


}