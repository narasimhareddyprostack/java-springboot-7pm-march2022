package com.jpa.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
