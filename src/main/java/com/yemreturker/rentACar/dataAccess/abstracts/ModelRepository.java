package com.yemreturker.rentACar.dataAccess.abstracts;

import com.yemreturker.rentACar.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {

}