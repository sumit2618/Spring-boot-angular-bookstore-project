package com.app.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.OrderDetails;

public interface OrderDetailsRepo extends JpaRepository<OrderDetails,Integer> {

}
