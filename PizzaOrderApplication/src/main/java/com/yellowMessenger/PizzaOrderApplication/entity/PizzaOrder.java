package com.yellowMessenger.PizzaOrderApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PizzaOrder {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
    @Column
	private String username;
	
    @Column
	private long mobile;
	
    @Column
	private String email;
	
    @Column
	private String dno;
	
    @Column
    private String street;
	
    @Column
    private String city;
	
    @Column
    private long pincode;
    
    @Column
    private String pizzaItem;
    
    @Column
    private String pizzaSize;
    
    @Column
    private String pizzaQuantity;
    
	
    @Column
    private String status;
	
	public PizzaOrder() {
		
	}
	
	

	public PizzaOrder(String username, long mobile, String email, String dno, String street, String city, long pincode,
			String pizzaItem, String pizzaSize, String pizzaQuantity, String status) {
		super();
		this.username = username;
		this.mobile = mobile;
		this.email = email;
		this.dno = dno;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.pizzaItem = pizzaItem;
		this.pizzaSize = pizzaSize;
		this.pizzaQuantity = pizzaQuantity;
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDno() {
		return dno;
	}

	public void setDno(String dno) {
		this.dno = dno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}



	public String getPizzaItem() {
		return pizzaItem;
	}



	public void setPizzaItem(String pizzaItem) {
		this.pizzaItem = pizzaItem;
	}



	public String getPizzaSize() {
		return pizzaSize;
	}



	public void setPizzaSize(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}



	public String getPizzaQuantity() {
		return pizzaQuantity;
	}



	public void setPizzaQuantity(String pizzaQuantity) {
		this.pizzaQuantity = pizzaQuantity;
	}
	
	

}
