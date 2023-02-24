package com.yemreturker.rentACar.core.dataAccess;

import com.yemreturker.rentACar.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User FindByEmail(String email);
}