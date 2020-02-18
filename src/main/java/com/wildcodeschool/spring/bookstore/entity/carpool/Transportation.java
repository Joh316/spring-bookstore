package com.wildcodeschool.spring.bookstore.entity.carpool;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.wildcodeschool.spring.bookstore.entity.Customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Transportation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate transportationEnd;
	
	private LocalDate transportationStart;
	
	
    //@JoinColumn(name = "passenger_id")
	@ManyToOne
    private Customer customer;
	
	//@JoinColumn(name = "car_id")
	@ManyToOne
    private Car car;

	
}
