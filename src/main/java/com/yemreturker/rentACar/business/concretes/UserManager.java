package com.yemreturker.rentACar.business.concretes;

import com.yemreturker.rentACar.business.abstracts.UserService;
import com.yemreturker.rentACar.core.dataAccess.UserRepository;
import com.yemreturker.rentACar.core.entities.User;
import com.yemreturker.rentACar.core.utilities.results.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserManager implements UserService {
    private UserRepository userRepository;
    @Override
    public Result Add(User user) {
        this.userRepository.save(user);
        return new SuccessResult();
    }

    @Override
    public DataResult<User> FindByEmail(String email) {
        User user = this.userRepository.FindByEmail(email);
        if (user != null) {
            return  new SuccessDataResult<User>(user);
        }
        else {
            return new ErrorDataResult<User>();
        }
    }
}