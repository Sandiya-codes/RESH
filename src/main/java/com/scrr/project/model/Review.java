package com.scrr.project.model;

import javax.print.attribute.standard.DateTimeAtCreation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reviewID;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userID;
	@ManyToOne
	@JoinColumn(name = "resource_id")
	private Resource resourceID;

	private Long  Rating;

	private String ReviewComment;

	private DateTimeAtCreation ReviewDate;

}
