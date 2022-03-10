package com.ec2sample.app.ec2demo.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.repository.CrudRepository;

import com.ec2sample.app.ec2demo.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
	List<User> findAll();

}
