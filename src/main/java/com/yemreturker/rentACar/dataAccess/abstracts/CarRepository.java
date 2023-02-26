package com.yemreturker.rentACar.dataAccess.abstracts;

import com.yemreturker.rentACar.entities.concretes.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

}