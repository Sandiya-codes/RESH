package com.scrr.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrr.project.model.Notification;

@Repository
public interface NotificationRepo extends JpaRepository<Notification, Long>{

}
