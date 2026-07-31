package com.scrr.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrr.project.model.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long>{
	

}
