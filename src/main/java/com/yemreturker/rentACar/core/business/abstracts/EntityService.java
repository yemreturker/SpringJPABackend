package com.yemreturker.rentACar.core.business.abstracts;

import com.yemreturker.rentACar.core.utilities.results.*;
import java.util.List;

public interface EntityService<T> {
    DataResult<List<T>> GetAll();
    DataResult<T> GetById(int id);
    Result Add(T entity);
    Result  Update(T entity);
    Result  Delete(int id);
}