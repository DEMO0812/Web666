package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.been.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Integer>{

	void deleteByProductProId(Integer proId);
	
}
