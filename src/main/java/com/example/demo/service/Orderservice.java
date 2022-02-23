package com.example.demo.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;

import com.example.demo.repository.Orderrepository;
@Service
public class Orderservice {
	@Autowired 
	Orderrepository orderRepository;
	
	public void saveUser(Order order) {
		orderRepository.save(order);
	}

	public Iterable<Order> getUsers() {
		return orderRepository.findAll();
	}
	
    public Optional<Order> getuser(Integer id) {
    	return orderRepository.findById(id);
    }
    
    public void deleteUser(Integer id) {
    	orderRepository.deleteById(id);
    }
}