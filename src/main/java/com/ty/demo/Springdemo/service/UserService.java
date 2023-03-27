package com.ty.demo.Springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.demo.Springdemo.dao.UserDao;
import com.ty.demo.Springdemo.dto.User;
import com.ty.demo.Springdemo.util.ResponseStructure;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	
	public ResponseEntity<ResponseStructure<User>> saveUser(User user){
		ResponseStructure<User> responseStructure= new ResponseStructure<User>();
		
		
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("User Resgitered");
		responseStructure.setData(userDao.saveUser(user));
		
		return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.CREATED);
	}
	
}
