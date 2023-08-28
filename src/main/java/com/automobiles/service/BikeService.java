package com.automobiles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.automobiles.dao.BikeDao;
import com.automobiles.entity.Bike;

@Service
public class BikeService {
	@Autowired
BikeDao bd;

	public String setBike(Bike b) {
		return bd.setBike(b);
	}
	public String setAllBike(@RequestBody List<Bike> b) {
		return bd.setAllBike(b);
	}
	public List<Bike> getAllBike() {
		return bd.getAllBike();
	}
	public Bike getById(int n) {
		return bd.getById(n);
	}
	public List<Bike> getByBrand(String b) {
		return bd.getByBrand(b);
	}
	public List<Bike> getByPrice(int n) {
		return bd.getByPrice(n);
	}
	public Bike getByMax() {
		return bd.getByMax();
	}
	public Bike getByMin() {
		return bd.getByMin();
	}
	public List<Bike> getByRange(int x,int y) {
		return bd.getByRange(x,y);
	}
	}

