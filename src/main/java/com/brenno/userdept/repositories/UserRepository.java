package com.brenno.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brenno.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
