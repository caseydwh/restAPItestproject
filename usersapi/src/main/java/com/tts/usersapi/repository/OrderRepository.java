package com.tts.usersapi.repository;

import com.tts.usersapi.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}