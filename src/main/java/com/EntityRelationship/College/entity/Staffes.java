package com.EntityRelationship.College.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Staffes {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
	
	private String subject;
	
	private String staffesname;
	
	private String staffesdepartment;
	
	@OneToMany(targetEntity = Students.class,cascade = {CascadeType.ALL})
	@JoinColumn(name = "staffes_id",referencedColumnName = "id" )
	private List <Students> student;
	
	
}
