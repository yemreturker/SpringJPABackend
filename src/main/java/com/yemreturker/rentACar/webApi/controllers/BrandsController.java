package com.yemreturker.rentACar.webApi.controllers;

import com.yemreturker.rentACar.business.abstracts.BrandService;
import com.yemreturker.rentACar.business.requests.CreateBrandRequest;
import com.yemreturker.rentACar.business.requests.UpdateBrandRequest;
import com.yemreturker.rentACar.business.responses.GetAllBrandsResponse;
import com.yemreturker.rentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
    private BrandService brandService;
    @GetMapping()
    public List<GetAllBrandsResponse> GetAll() {
        return this.brandService.GetAll();
    }
    @GetMapping()
    @RequestMapping("/{id}")
    public GetByIdBrandResponse GetById(@PathVariable int id) {
        return this.brandService.GetById(id);
    }
    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void  Add(@RequestBody() CreateBrandRequest createBrandRequest) {
        this.brandService.Add(createBrandRequest);
    }
    @PutMapping()
    public  void  Update(@RequestBody() UpdateBrandRequest updateBrandRequest) {
        this.brandService.Update(updateBrandRequest);
    }
    @DeleteMapping("/{id}")
    public  void  Delete(@PathVariable int id) {
        this.brandService.Delete(id);
    }
}