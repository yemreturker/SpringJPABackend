package com.yemreturker.rentACar.business.abstracts;

import com.yemreturker.rentACar.core.utilities.results.*;
import com.yemreturker.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    DataResult<List<Brand>> GetAll();
    DataResult<Brand> GetById(int id);
    Result Add(Brand brand);
    Result  Update(Brand brand);
    Result  Delete(int id);
}