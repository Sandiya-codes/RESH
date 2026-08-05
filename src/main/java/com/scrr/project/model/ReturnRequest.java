package com.scrr.project.model;
import com.scrr.project.enumration.*;

import javax.print.attribute.standard.DateTimeAtCreation;

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
public class ReturnRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long returnID;
	
	@ManyToOne
	@JoinColumn(name = "booking_id")
	private Booking bookingID;

	private DateTimeAtCreation ReturnDate;

	@Enumerated
	private ResourceConditionEnum ResourceCondition;

	private String LateFine;
    
	@Enumerated
	private ReturnStatusEnum ReturnStatus;
}
