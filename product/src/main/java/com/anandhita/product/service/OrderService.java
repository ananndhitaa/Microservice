package com.anandhita.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anandhita.product.repository.OrderRepository;
import com.anandhita.product.model.Order;

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
        return orderRepository.findById(id).orElse(null);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    public void deleteByPelangganId(Integer pelangganId) {
        orderRepository.deleteByPelangganId(pelangganId);
    }
}
