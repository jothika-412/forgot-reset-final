package com.example.form1.service;

import com.example.form1.dto.UserDto;
import com.example.form1.model.User;

//import customloginapplication.dto.UserDto;
//import customloginapplication.model.User;

public interface UserService {
	
	User findByUsername(String username);
	User save (UserDto userDto);
	User save (User user);

}