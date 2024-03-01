package com.poly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.been.Order;

public interface OrderDAO extends JpaRepository<Order, Integer>{

}
