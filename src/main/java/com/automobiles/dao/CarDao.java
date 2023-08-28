package com.automobiles.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.automobiles.entity.Car;
import com.automobiles.repository.CarRepository;

@Repository
public class CarDao {
@Autowired 
CarRepository cr;
public String setCar(Car c) {
	cr.save(c);
	return "save";
}
public String setAllCar(List<Car> c) {
	cr.saveAll(c);
	return "save";
}
public List<Car> getAllCar() {
return cr.findAll();
}
public Car getById(int n) {
	return cr.findById(n).get();
}
public String deleteById(int x) {
	 cr.deleteById(x);
	return "msg deleted";
}
public String postAll( List<Car> j) {
	cr.saveAll(j);
	return "posted";
}
}
