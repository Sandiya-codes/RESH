package com.scrr.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrr.project.model.Complaint;

@Repository
public interface ComplaintRepo extends JpaRepository<Complaint, Long> {

}
