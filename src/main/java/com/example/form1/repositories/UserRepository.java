package com.example.form1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.form1.model.User;

//import customloginapplication.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername (String username);

}