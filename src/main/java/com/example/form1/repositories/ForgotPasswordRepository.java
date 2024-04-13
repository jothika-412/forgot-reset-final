package com.example.form1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.form1.model.ForgotPasswordToken;

//import customloginapplication.model.ForgotPasswordToken;

@Repository
public interface ForgotPasswordRepository extends JpaRepository<ForgotPasswordToken, Long>{

	ForgotPasswordToken findByToken(String token);
	
}