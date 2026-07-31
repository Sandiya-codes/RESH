package com.scrr.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrr.project.model.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long> {
	

}
