package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.OrderDetails;
import com.app.entity.dao.OrderDetailsRepo;

@Service
public class OrderDetailsImpl implements OrderDetailService {
	
	private OrderDetailsRepo orderRepo;
	
	@Autowired
	public OrderDetailsImpl(OrderDetailsRepo orderRepo) {
		this.orderRepo = orderRepo;
	}

	@Override
	public void saveOrderDetails(OrderDetails orderDetails) {
		//saving order details into table
		orderRepo.save(orderDetails);
	}

	@Override
	public List<OrderDetails> getOrderDetails() {
		// geting data from table
		return orderRepo.findAll();
	}

}
