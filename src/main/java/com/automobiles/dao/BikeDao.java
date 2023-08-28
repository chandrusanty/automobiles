package com.automobiles.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.automobiles.entity.Bike;
import com.automobiles.repository.BikeRepository;
import com.automobiles.repository.CarRepository;
@Repository
public class BikeDao {
@Autowired
BikeRepository br;
	public String setBike(Bike b) {
		br.save(b);
		return "saved";
	}
	public String setAllBike(List<Bike> b) {
		br.saveAll(b);
		return "saved";
	}
   public List<Bike> getAllBike() {
	   return br.findAll();
   }
   public Bike getById(int n) {
	   return br.findById(n).get();
   }
   public List<Bike> getByBrand(String b ) {
	   return br.getByBrand(b);
   }
   public List<Bike> getByPrice(int n) {
	   return br.getByPrice(n);
   }
   public Bike getByMax() {
	   return br.getByMax();
   }
   public Bike getByMin() {
	   return br.getByMin();
   }
   public List<Bike> getByRange(int x,int y) {
	   return br.getByRange(x,y);
   }
}
