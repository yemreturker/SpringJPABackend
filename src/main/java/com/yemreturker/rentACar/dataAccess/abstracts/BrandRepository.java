package com.yemreturker.rentACar.dataAccess.abstracts;

import com.yemreturker.rentACar.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

}