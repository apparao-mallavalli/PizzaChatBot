package com.yellowMessenger.PizzaOrderApplication.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yellowMessenger.PizzaOrderApplication.repository.OrderRepository;

@CrossOrigin("http://apparao-mallavalli.github.io/pizza/")

@RestController
public class PizzaOrder {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@GetMapping("/pizzaOrders/{id}")
	public Optional<com.yellowMessenger.PizzaOrderApplication.entity.PizzaOrder> getById(@PathVariable("id") Long id){
		return orderRepository.findById(id);
	}
	
	@RequestMapping(value = "/pizzaOrders", method = RequestMethod.POST)
	  public com.yellowMessenger.PizzaOrderApplication.entity.PizzaOrder persistPerson(@RequestBody PizzaOrder pizzaOrder) {
	    
	    return orderRepository.save(pizzaOrder);
	  }
	}

