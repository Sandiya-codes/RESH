package com.scrr.project.model;
import javax.print.attribute.standard.DateTimeAtCreation;

import com.scrr.project.enumration.*;
 
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long paymentID;

	@ManyToOne
	@JoinColumn(name = "booking_id")
    
	private Booking bookingId;
	
	private String PaymentAmount;
	
	@Enumerated
	private PaymentMethodEnum paymentMethod;

	@Enumerated
	private PaymentStatusEnum paymentStatus;

	private DateTimeAtCreation PaymentDate;

	private Long transactionID;

}
