package com.scrr.project.model;
import com.scrr.project.enumration.ReadStatus;

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
public class Notification {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long NotificationID;

@ManyToOne
@JoinColumn(name = "user_id")
private User UserID;

private String NotificationTitle;

private String Message;

private String NotificationDate;
@Enumerated
private ReadStatus ReadStatus;

}
