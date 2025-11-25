package com.felipe.payment_service.service.impl;

import com.felipe.payment_service.model.Payment;
import com.felipe.payment_service.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {


    @Override
    public void sendPayment(Payment payment) {
       log.info("PAYMENT_SERVICE ::: Recebi o pagamento {}", payment);
    }
}
