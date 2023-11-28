package com.EntityRelationship.College.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EntityRelationship.College.entity.Staffes;

@Repository
public interface StaffesRepository extends JpaRepository<Staffes, Integer> {

	Optional<Staffes> deleteByStaffesname(String staffesname);

	
	
}
