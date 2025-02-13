package com.webenius.reactiveorderservice.service;

import com.webenius.reactiveorderservice.model.Order;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderService {
    Mono<Order> placeOrder(Order order);
    Mono<Order> getOrderById(String id);
    Flux<Order> getAllOrders();
    Flux<Order> getOrdersByProductId(String productId);
    Flux<Order> streamOrderUpdates(); // For real-time updates
}
