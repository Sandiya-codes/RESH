package com.scrr.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrr.project.model.Resource;

@Repository
public interface ResourceRepo extends JpaRepository<Resource, Long>{
	

}
