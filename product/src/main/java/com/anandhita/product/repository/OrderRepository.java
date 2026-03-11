package com.anandhita.product.repository;

import org.springframework.stereotype.Repository;
import com.anandhita.product.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    void deleteByPelangganId(Integer pelangganId);
}
