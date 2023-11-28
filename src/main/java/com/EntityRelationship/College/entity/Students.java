package com.EntityRelationship.College.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Students {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	
	private String studentname;
	
	private String studentaddress;
	 
	private String studentdepartment; 
}
