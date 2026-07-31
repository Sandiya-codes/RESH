package com.scrr.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrr.project.model.ReturnRequest;

@Repository
public interface ReturnRequestRepo extends JpaRepository<ReturnRequest, Long> {

}
