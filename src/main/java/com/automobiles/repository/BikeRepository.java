package com.automobiles.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.automobiles.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer>{
	@Query(value="select * from bike_details where brand like ?",nativeQuery=true)
 List<Bike> getByBrand(String b);
	@Query(value="select * from bike_details where price like ?",nativeQuery=true)
	List<Bike> getByPrice(int n);
	@Query(value="select * from bike_details where price=(select max(price) from bike_details) ",nativeQuery=true)
	Bike getByMax();
	@Query(value="select * from bike_details where price=(select min(price) from bike_details) ",nativeQuery=true)
	Bike getByMin();
	@Query(value="select * from bike_details where price>=? and price<=? ",nativeQuery=true)
	List<Bike> getByRange(int x,int y);
}
   