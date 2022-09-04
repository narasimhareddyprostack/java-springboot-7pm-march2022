package com.jpa.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.jpa.entity.Passenger;
import com.jpa.repositry.PassengerRepository;

public class MyRunner implements CommandLineRunner {
	
	@Autowired
	PassengerRepository passengerRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Passenger p = new Passenger();
		p.setPassengerId(101);
		p.setFirstName("Rahul");
		p.setLastName("Gandhi");
		p.setEmailId("Rahul@tcs.com");
		System.out.println(p);
		
		passengerRepo.save(p);
		
		List <Passenger> data = passengerRepo.findAll();
		data.forEach(p1 -> { System.out.println(p1.getFirstName());});
	
	}

}
