package com.example.BookStore.service;


import com.example.BookStore.DTO.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class orderService {
    private final com.example.BookStore.service.shippingService shippingService;
    private final com.example.BookStore.service.paymentService paymentService;

    @Autowired
    public  orderService(shippingService shippingService, paymentService paymentService) {
        this.shippingService = shippingService;
        this.paymentService = paymentService;
    }

    public void placeOrder(Order order) {
        // Business logic for placing an order
        shippingService.shipOrder(order);
        paymentService.processPayment(order);
    }
}
