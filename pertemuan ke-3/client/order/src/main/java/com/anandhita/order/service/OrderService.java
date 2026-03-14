package com.anandhita.order.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anandhita.order.model.Order;
import com.anandhita.order.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order createOrder(Order order) {
    order.hitungTotal();
    return orderRepository.save(order);
}

    public Order getOrderById(Long id) {
        return orderRepository.findById(id.intValue()).orElse(null);
    }


}
