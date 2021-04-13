package com.lortrindade.hrpayroll.services;

import com.lortrindade.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Lorhana", 200.00, days);
    }
}
