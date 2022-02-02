package com.pagworks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pagworks.model.User;

//Utilização do JPA, para CRUD no banco de dados.
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	

	

}

