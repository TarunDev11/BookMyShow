package org.example.Model;

import org.example.Enum.PaymentMethodType;
import org.example.Enum.PaymentStatus;

public class Payment {
    private
    PaymentMethodType paymentMethodType;
    private PaymentStatus paymentStatus;
    private Double amount;
    private String reference;
}
