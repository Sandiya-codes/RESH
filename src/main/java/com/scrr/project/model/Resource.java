package com.scrr.project.model;
import com.scrr.project.enumration.*;

import jakarta.persistence.Column;
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
public class Resource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long resourceId;
	
	private String ResourceName;
    private String Description;
    
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categoryID;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;
   
    private String ResourceImage;
    
    @Enumerated
    private AvailabilityStatusEnum availabilityStatusEnum;
    
    @Enumerated
    @Column(name = "resource_condition")
    private ResourceConditionEnum ResourceConditionEnum;
    private String SecurityDeposit;


}
