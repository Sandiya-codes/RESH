package com.scrr.project.model;
import com.scrr.project.enumration.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class RentalPlan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rentalPlanID;
	
	@ManyToOne
	@JoinColumn(name = "resource_id")
    private Resource resourceID;
    
    @Enumerated
    private RentalTypeEnum  RentalType;
    
    private String  RentalPrice;
    private String LateFee;

}
