package com.scrr.project.model;

import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCreation;

import com.scrr.project.enumration.BookingStatusEnum;

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
public class Booking {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long bookingID;

@ManyToOne
@JoinColumn(name = "user_id")
private User userId;

@ManyToOne
@JoinColumn(name = "resource_id")
private Resource resourceId;

private DateTimeAtCreation bookingDate;

private DateTimeAtCreation startDate;

private DateTimeAtCreation endDate;

@Enumerated
private BookingStatusEnum bookingStatus;

private String totalAmount;

}
