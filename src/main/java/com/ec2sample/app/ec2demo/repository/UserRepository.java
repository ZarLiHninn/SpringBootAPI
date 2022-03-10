package com.ec2sample.app.ec2demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec2sample.app.ec2demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
