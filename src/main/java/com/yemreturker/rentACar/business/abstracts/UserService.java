package com.yemreturker.rentACar.business.abstracts;

import com.yemreturker.rentACar.core.entities.User;
import com.yemreturker.rentACar.core.utilities.results.DataResult;
import com.yemreturker.rentACar.core.utilities.results.Result;

public interface UserService {
    Result Add(User user);
    DataResult<User> FindByEmail(String email);
}