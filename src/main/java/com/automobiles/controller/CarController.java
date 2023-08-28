package com.automobiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automobiles.entity.Car;
import com.automobiles.service.CarService;

@RestController
@RequestMapping(value="/Car")     //bcox of 1 package 2 class
public class CarController {
@Autowired
CarService cs;
@PostMapping(value="/setCar")
public String setCar(@RequestBody Car c) {
	return cs.setCar(c);
}
@PostMapping(value="/setAllCar")
public String setAllCar(@RequestBody List<Car> c) {
return cs.setAllCar(c);
}
@GetMapping(value="/getAllCar")
public List<Car> getAllCar() {
	return cs.getAllCar();
}
@GetMapping(value="/getById/{n}")
public Car getById(@PathVariable int n) {
	return cs.getById(n);
}
@GetMapping(value="/getByBrand/{s}")
public List<Car> getByBrand(@PathVariable String s) {
	return cs.getByBrand(s);
}
@GetMapping(value="/getBrandByPrice/{n}")
public List<String> getBrandByPrice(@PathVariable int n) {
	return cs.getBrandByPrice(n);
}
@GetMapping(value="/getByRange/{x}/{y}")
public List<Car> getByRange(@PathVariable int x,@PathVariable int y) {
	return cs.getByRange(x,y);
}
@GetMapping(value="/getMaxPrice")
public Car getMaxPrice() {
	return getMaxPrice();
}
@PutMapping(value="/updatePrice/{x}")
public String updatePrice(@PathVariable int x) {
	return cs.updatePrice(x);
}
@DeleteMapping(value="/deleteById/{x}")
public String deleteById(@PathVariable int x) {
	return cs.deleteById(x);
}
@PostMapping(value="/postAll/{j}")
public String postAll(@RequestBody List<Car> j) {
	return cs.postAll(j);
}
}
