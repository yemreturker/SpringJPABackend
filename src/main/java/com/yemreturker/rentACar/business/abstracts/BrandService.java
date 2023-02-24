package com.yemreturker.rentACar.business.abstracts;

import com.yemreturker.rentACar.business.requests.CreateBrandRequest;
import com.yemreturker.rentACar.business.requests.UpdateBrandRequest;
import com.yemreturker.rentACar.business.responses.GetAllBrandsResponse;
import com.yemreturker.rentACar.business.responses.GetByIdBrandResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> GetAll();
    GetByIdBrandResponse GetById(int id);
    void  Add(CreateBrandRequest createBrandRequest);
    void  Update(UpdateBrandRequest updateBrandRequest);
    void  Delete(int id);
}