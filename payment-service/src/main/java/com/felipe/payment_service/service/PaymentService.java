package com.felipe.payment_service.service;

import com.felipe.payment_service.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
