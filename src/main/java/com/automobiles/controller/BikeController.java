package com.automobiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automobiles.entity.Bike;
import com.automobiles.entity.Car;
import com.automobiles.service.BikeService;
import com.automobiles.service.CarService;
@RestController
@RequestMapping(value="/bike")       //bcoz of one package and two class
public class BikeController {
	@Autowired
	BikeService bs;
	@PostMapping(value="/setBike")
	public String setBike(@RequestBody Bike b) {
		return bs.setBike(b);
	}
	@PostMapping(value="/setAllBike")
	public String setAllBike(@RequestBody List<Bike> b) {
		return bs.setAllBike(b);
	}
	@GetMapping(value="/getAllBike")
	public List<Bike> getAllBike() {
		return bs.getAllBike();
	}
	@GetMapping(value="/getById/{n}")
	public Bike getById(@PathVariable int n) {
		return bs.getById(n);
	} 
	@GetMapping(value="/getByBrand/{b}")
	public List<Bike> getByBrand(@PathVariable String b) {
		return bs.getByBrand(b);
	}
	@GetMapping(value="/getByPrice/{n}")
	public List<Bike> getByPrice(@PathVariable int n) {
		return bs.getByPrice(n);
	}
    @GetMapping(value="/getByMax")
    public Bike getByMax() {
    return bs.getByMax();
    }
    @GetMapping(value="/getByMin")
    public Bike getByMin() {
    	return bs.getByMin();    
    }
    @GetMapping(value="/getByRange/{x}/{y}")
    public List<Bike> getByRange(@PathVariable int x,@PathVariable int y) {
    	return bs.getByRange(x,y);
    }
}
