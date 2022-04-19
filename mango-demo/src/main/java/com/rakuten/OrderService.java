package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	OrderRepository repository;
	List<Order> orders = new ArrayList<>();

	public void save(Order order) {
		orders.add(order);
		repository.save(order);
		System.out.println("Save method called");
	}

	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
