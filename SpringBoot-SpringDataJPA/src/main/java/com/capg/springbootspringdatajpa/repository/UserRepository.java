package com.capg.springbootspringdatajpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.springbootspringdatajpa.entities.UserRecord;

@Repository
public interface UserRepository extends CrudRepository<UserRecord, String> {
	
}
