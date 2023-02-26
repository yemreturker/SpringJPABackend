package com.yemreturker.rentACar.dataAccess.abstracts;

import com.yemreturker.rentACar.entities.concretes.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color, Integer> {

}