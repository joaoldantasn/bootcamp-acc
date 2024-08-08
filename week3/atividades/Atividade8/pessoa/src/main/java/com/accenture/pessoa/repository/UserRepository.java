package com.accenture.pessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.accenture.pessoa.entity.user.User;

public interface UserRepository extends JpaRepository<User, Long>{

	//consulta usuario pelo login
	UserDetails findByLogin(String login);
	
}
