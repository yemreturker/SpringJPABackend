package com.yemreturker.rentACar.webApi.controllers;

import com.yemreturker.rentACar.business.abstracts.BrandService;
import com.yemreturker.rentACar.core.utilities.results.*;
import com.yemreturker.rentACar.entities.concretes.Brand;
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
    public DataResult<List<Brand>> GetAll() {
        return this.brandService.GetAll();
    }
    @GetMapping("/{id}")
    public DataResult<Brand> GetById(@PathVariable int id) {
        return this.brandService.GetById(id);
    }
    @PostMapping("/add")
    public Result Add(@RequestBody() Brand brand) {
        return this.brandService.Add(brand);
    }
    @PutMapping("/update")
    public Result Update(@RequestBody() Brand brand) {
        return this.brandService.Update(brand);
    }
    @DeleteMapping("/delete")
    public  Result  Delete(@PathVariable int id) {
        return this.brandService.Delete(id);
    }
}