package com.felipe.payment_service.resource.impl;

import com.felipe.payment_service.model.Payment;
import com.felipe.payment_service.resource.PaymentResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResourceImpl implements PaymentResource {

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        return null;
    }
}
