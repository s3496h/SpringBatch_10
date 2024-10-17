package com.koreait.exam.springbatch_10.app.order.repository;

import com.koreait.exam.springbatch_10.app.cart.entity.CartItem;
import com.koreait.exam.springbatch_10.app.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {

}