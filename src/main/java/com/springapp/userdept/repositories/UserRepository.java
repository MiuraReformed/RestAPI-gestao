package com.springapp.userdept.repositories;

import com.springapp.userdept.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long >{
    
}


