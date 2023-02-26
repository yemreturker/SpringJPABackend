package com.yemreturker.rentACar.business.concretes;

import com.yemreturker.rentACar.business.abstracts.ColorService;
import com.yemreturker.rentACar.business.constants.Messages;
import com.yemreturker.rentACar.core.utilities.results.*;
import com.yemreturker.rentACar.dataAccess.abstracts.ColorRepository;
import com.yemreturker.rentACar.entities.concretes.Color;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ColorManager implements ColorService {
    private ColorRepository colorRepository;
    @Override
    public DataResult<List<Color>> GetAll() {
        var result = this.colorRepository.findAll();
        if (result.toArray().length > 0) {
            return new SuccessDataResult<>(result);
        }
        return new ErrorDataResult<>(result, Messages.ColorListEmpty);
    }
    @Override
    public DataResult<Color> GetById(int id) {
        var result = this.colorRepository.findById(id).orElseThrow();
        return new SuccessDataResult<>(result);
    }
    @Override
    public Result Add(Color entity) {
        this.colorRepository.save(entity);
        return new SuccessResult(Messages.ColorAdded);
    }
    @Override
    public Result Update(Color entity) {
        var result = this.colorRepository.findById(entity.getId());
        if (result.isPresent()) {
            return new SuccessResult(Messages.ColorUpdated);
        }
        return new ErrorResult(Messages.ColorNotFound);
    }
    @Override
    public Result Delete(int id) {
        var result = this.colorRepository.findById(id);
        if (result.isPresent()) {
            this.colorRepository.deleteById(id);
            return new SuccessResult(Messages.ColorDeleted);
        }
        return new ErrorResult(Messages.ColorNotFound);
    }
}