package com.automobiles.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.automobiles.dao.CarDao;
import com.automobiles.entity.Car;

@Service
public class CarService {
@Autowired
CarDao cd;
public String setCar(Car c) {
	return cd.setCar(c);
}
public String setAllCar(@RequestBody List<Car> c ) {
	return cd.setAllCar(c);
}
public List<Car> getAllCar() {
	return cd.getAllCar();
}
public Car getById(int n) {
	return cd.getById(n);
}
public List<Car> getByBrand(String s) {
	List<Car> x=getAllCar();
	List<Car> z=x.stream().filter(y->y.getBrand().equalsIgnoreCase(s)).collect(Collectors.toList());
	return z;
}
public List<String> getBrandByPrice(int n) {
	List<Car> d=getAllCar();
	List<String> x=d.stream().filter(y->y.getPrice()==n).map(y->y.getBrand()).collect(Collectors.toList());
	return x;
}
public List<Car> getByRange(int x,int y) {
	List<Car> a=getAllCar();
	List<Car> b=a.stream().filter(c->c.getPrice()>=x&&c.getPrice()<=y).collect(Collectors.toList());
	return b;
}
public Car getMaxPrice() {
	List<Car> g=getAllCar();
	Car h=g.stream().max(Comparator.comparingInt(Car::getPrice)).get();
	return h;
}
public String updatePrice(int x) {
	List<Car> n=getAllCar();
	n.forEach(y-> {
		int amt=y.getPrice()+x;
		y.setPrice(amt);
		
	});
	return setAllCar(n);
}
public String deleteById(int x) {
	return cd.deleteById(x);
}
public String postAll(List<Car> j) {
	return cd.postAll(j);
}
}
