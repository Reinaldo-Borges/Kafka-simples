package com.reinaldo.paymentservice.resource.service;

import com.reinaldo.paymentservice.model.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}
