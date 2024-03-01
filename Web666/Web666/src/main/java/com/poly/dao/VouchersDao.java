package com.poly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.been.Voucher;

public interface VouchersDao extends JpaRepository<Voucher, String>{

}
