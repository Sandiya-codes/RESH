package com.scrr.project.model;
import javax.print.attribute.standard.DateTimeAtCreation;

import com.scrr.project.enumration.ReadStatusEnum;
import com.scrr.project.enumration.ReadStatusEnum;

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


private DateTimeAtCreation NotificationDate;

@Enumerated
private ReadStatusEnum ReadStatus;

}
