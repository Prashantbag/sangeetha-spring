package com.ty.demo.Springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.demo.Springdemo.dto.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
