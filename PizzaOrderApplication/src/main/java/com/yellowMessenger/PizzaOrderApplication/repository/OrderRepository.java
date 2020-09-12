package com.yellowMessenger.PizzaOrderApplication.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.yellowMessenger.PizzaOrderApplication.entity.PizzaOrder;



public interface OrderRepository extends JpaRepository<PizzaOrder, Long> {
	
	public Optional<PizzaOrder> findById(Long id);

	//public PizzaOrder findById(long id);

	public PizzaOrder save(com.yellowMessenger.PizzaOrderApplication.controller.PizzaOrder pizzaOrder);

}
