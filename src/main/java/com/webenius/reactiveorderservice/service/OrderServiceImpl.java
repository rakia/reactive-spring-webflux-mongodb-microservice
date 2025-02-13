package com.webenius.reactiveorderservice.service;

import com.webenius.reactiveorderservice.model.Order;
import com.webenius.reactiveorderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.time.Duration;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public Mono<Order> placeOrder(Order order) {
        order.setId(UUID.randomUUID().toString()); // Generate UUID for order ID
        order.setStatus("PENDING"); // Default status for new orders
        return orderRepository.save(order);
    }

    @Override
    public Mono<Order> getOrderById(String id) {
        return orderRepository.findById(id);
    }

    @Override
    public Flux<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Flux<Order> getOrdersByProductId(String productId) {
        return orderRepository.findByProductId(productId);
    }

    @Override
    public Flux<Order> streamOrderUpdates() {
        // Simulate order updates every 2 seconds for demonstration
        return Flux.interval(Duration.ofSeconds(2))
                .flatMap(tick -> {
                    Order order = new Order();
                    order.setId(UUID.randomUUID().toString());
                    order.setProductId("Product-" + (tick % 3 + 1)); // Cycle through 3 product IDs
                    order.setQuantity((int) (Math.random() * 5) + 1); // Random quantity 1-5
                    order.setStatus(getRandomStatus()); // Get a random status
                    return Mono.just(order);
                })
                .log(); // Log updates for demonstration
    }

    private String getRandomStatus() {
        String[] statuses = {"PENDING", "PROCESSING", "SHIPPED", "DELIVERED"};
        int randomIndex = (int) (Math.random() * statuses.length);
        return statuses[randomIndex];
    }
}
