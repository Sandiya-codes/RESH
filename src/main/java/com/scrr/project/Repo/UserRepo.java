package com.scrr.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrr.project.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	

}
