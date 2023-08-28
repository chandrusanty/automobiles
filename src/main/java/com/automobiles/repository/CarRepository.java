package com.automobiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automobiles.entity.Bike;
import com.automobiles.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

	void save(Bike b);

}
