package com.scrr.project.model;

import javax.print.attribute.standard.DateTimeAtCreation;


import com.scrr.project.enumration.ComplaintStatusEnum;

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
public class Complaint {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long complaintID;

	
	@ManyToOne
	@JoinColumn(name = "user_id")
   private User userID;
	
	@ManyToOne
	@JoinColumn(name = "resource_id")
	private Resource resourceID;

	private String complaintType;

	private String description;
	
    @Enumerated
    private ComplaintStatusEnum complaintStatus;

	private DateTimeAtCreation createdDate;


}
