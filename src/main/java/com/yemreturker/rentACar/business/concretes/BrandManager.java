package com.yemreturker.rentACar.business.concretes;

import com.yemreturker.rentACar.business.abstracts.BrandService;
import com.yemreturker.rentACar.business.requests.CreateBrandRequest;
import com.yemreturker.rentACar.business.requests.UpdateBrandRequest;
import com.yemreturker.rentACar.business.responses.GetAllBrandsResponse;
import com.yemreturker.rentACar.business.responses.GetByIdBrandResponse;
import com.yemreturker.rentACar.core.utilities.mappers.ModelMapperService;
import com.yemreturker.rentACar.dataAccess.abstracts.BrandRepository;
import com.yemreturker.rentACar.entities.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
    @Override
    public List<GetAllBrandsResponse> GetAll() {
        List<Brand> brands = this.brandRepository.findAll();
        return brands.stream()
                .map(brand -> this.modelMapperService.forResponse()
                        .map(brand, GetAllBrandsResponse.class)).toList();
    }
    @Override
    public GetByIdBrandResponse GetById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();
        return this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);
    }
    @Override
    public void Add(CreateBrandRequest createBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
        this.brandRepository.save(brand);
    }
    @Override
    public void Update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
        this.brandRepository.save(brand);
    }
    @Override
    public void Delete(int id) {
        this.brandRepository.deleteById(id);
    }
}