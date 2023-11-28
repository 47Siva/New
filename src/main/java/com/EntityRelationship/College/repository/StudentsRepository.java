package com.EntityRelationship.College.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EntityRelationship.College.entity.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer>{

}
