package com.scrr.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrr.project.model.RentalPlan;

@Repository
public interface RentalPlanRepo extends JpaRepository<RentalPlan, Long>{
	

}
