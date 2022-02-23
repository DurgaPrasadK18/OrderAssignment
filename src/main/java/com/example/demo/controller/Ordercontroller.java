package com.example.demo.controller;


import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;

import com.example.demo.service.Orderservice;
@RestController
public class Ordercontroller {
	@Autowired
	 Orderservice orderService;
	 
		@PostMapping("/order")
		@ResponseStatus(code = HttpStatus.CREATED)
		void creatUser(@RequestBody @Valid Order order) {
			orderService.saveUser(order);
		}
		@GetMapping("/order")
		Iterable<Order> getusers() {
			return orderService.getUsers();
		}
		
	    @GetMapping("/order/{id}")
	   Optional<Order> getUsers(@PathVariable("id") Integer id) {
		   return orderService.getuser(id);
	    }
	    @DeleteMapping("/order/{id}")
		void deleteUser(@PathVariable("id") Integer id) {
			orderService.deleteUser(id);
		}
}