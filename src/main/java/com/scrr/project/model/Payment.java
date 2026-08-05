package com.scrr.project.model;
import javax.print.attribute.standard.DateTimeAtCreation;

import com.scrr.project.enumration.*;
 
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long paymentID;

	@ManyToOne
	private Booking booking;
	
	private String PaymentAmount;
	
	@Enumerated(EnumType.STRING)
	private PaymentMethodEnum paymentMethod;

	@Enumerated(EnumType.STRING)
	private PaymentStatusEnum paymentStatus;

	private DateTimeAtCreation PaymentDate;

	private Long transactionID;

}
