package com.scrr.project.model;

import java.time.LocalDateTime;

import com.scrr.project.enumration.BookingStatus;

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
public class Booking {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long bookingID;

@ManyToOne
@JoinColumn(name = "user_id")
private User user;

@ManyToOne
@JoinColumn(name = "resource_id")
private Resource resource;

private LocalDateTime bookingDate;

private LocalDateTime startDate;

private LocalDateTime endDate;

@Enumerated(EnumType.STRING)
private BookingStatus bookingStatus;

private String totalAmount;

}
