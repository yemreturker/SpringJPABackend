package com.yemreturker.rentACar.business.concretes;

import com.yemreturker.rentACar.business.abstracts.BrandService;
import com.yemreturker.rentACar.business.constants.Messages;
import com.yemreturker.rentACar.core.utilities.results.*;
import com.yemreturker.rentACar.dataAccess.abstracts.BrandRepository;
import com.yemreturker.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    @Override
    public DataResult<List<Brand>> GetAll() {
        var result = this.brandRepository.findAll();
        if (result.toArray().length > 0) {
            return new SuccessDataResult<>(result);
        }
        return new ErrorDataResult<>(result, Messages.BrandListEmpty);
    }
    @Override
    public DataResult<Brand> GetById(int id) {
        var result = this.brandRepository.findById(id).orElse(null);
        if (result != null) {
            return new SuccessDataResult<>(result);
        }
        return new ErrorDataResult<>(Messages.BrandNotFound);
    }
    @Override
    public Result Add(Brand brand) {
        this.brandRepository.save(brand);
        return new SuccessResult(Messages.BrandAdded);
    }
    @Override
    public Result Update(Brand brand) {
        var result = this.brandRepository.findById(brand.getId());
        if (result.isPresent()) {
            return new SuccessResult(Messages.BrandUpdated);
        }
        return new ErrorResult(Messages.BrandNotFound);
    }
    @Override
    public Result Delete(int id) {
        var result = this.brandRepository.findById(id);
        if (result.isPresent()) {
            this.brandRepository.deleteById(id);
            return new SuccessResult(Messages.BrandDeleted);
        }
        return new ErrorResult(Messages.BrandNotFound);
    }
}