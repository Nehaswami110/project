package com.ecourier.service.impl;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.core.support.UnsupportedFragmentException;
import org.springframework.stereotype.Service;

 

import com.ecourier.exception.InvalidInputException;
import com.ecourier.service.TransactionService;
import com.ecourier.entity.PaymentMethod;
import com.ecourier.entity.PaymentStatus;
import com.ecourier.entity.Transaction;
import com.ecourier.repo.TransactionRepository;

 

@Service
public class TransactionServiceImpl implements TransactionService{
    @Autowired
    private TransactionRepository paymentRepository;
    public TransactionServiceImpl(TransactionRepository paymentRepository ) {
        this.paymentRepository=paymentRepository;
    }
    @Override
    public Transaction payBill(Transaction transaction) {
        // TODO Auto-generated method stub
        if(transaction.getCustomerId() !=0||transaction.getAmount() !=0) {
            Transaction payment =new Transaction();
            payment.setAmount(transaction.getAmount());
            payment.setCustomerId(transaction.getCustomerId());
            payment.setTrackingNumber(transaction.getTrackingNumber());
            payment.setMethod(transaction.getMethod());
            payment.setStatus(transaction.getStatus());
            Transaction save = this.paymentRepository.save(payment);
            return save;
        }
        else {
            Transaction payment =new Transaction();
            payment.setAmount(transaction.getAmount());
            payment.setCustomerId(transaction.getCustomerId());
            payment.setTrackingNumber(transaction.getTrackingNumber());
            payment.setMethod(transaction.getMethod());
            payment.setStatus(transaction.getStatus());
            Transaction save = this.paymentRepository.save(payment);
            return save;
        }


    }
    @Override
    public String cancelPayment(long transactionId) {
        Transaction transaction = this.paymentRepository.findById(transactionId).orElse(null);
        paymentRepository.delete(transaction);
        return "cancelled";
    }
    @Override
    public Transaction viewBill(long transactionId) {
        Transaction transaction = this.paymentRepository.findById(transactionId).orElse(null);
        long transactionList=transaction.getTransactionId();
    return transaction;
}
}