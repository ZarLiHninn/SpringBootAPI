package com.ec2sample.app.ec2demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ec2sample.app.ec2demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
