package com.EntityRelationship.College.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EntityRelationship.College.entity.Staffes;
import com.EntityRelationship.College.entity.Students;
import com.EntityRelationship.College.repository.StaffesRepository;
import com.EntityRelationship.College.repository.StudentsRepository;

@Service
public class CollegeService {

	@Autowired
	StaffesRepository staffesrepository;

	/*
	 * @Autowired StudentsRepository studentsRepository;
	 */
	public Staffes store(Staffes staffes) {
		// TODO Auto-generated method stub
		return staffesrepository.save(staffes);
	}

	public List<Staffes> listPost(List<Staffes> staffes) {
		// TODO Auto-generated method stub
		return staffesrepository.saveAll(staffes);
	}

	public Optional<Staffes> getById(int id) {	
		// TODO Auto-generated method stub
		return staffesrepository.findById(id);
	}

	public Staffes update(Staffes staffes) {
		// TODO Auto-generated method stub
		return staffesrepository.save(staffes);
	}

	public void deleteid(int id) {
		// TODO Auto-generated method stub
		/*
		 * Optional<Staffes> staffes = staffesrepository.findById(id); Staffes
		 * staffes1=staffes.get(); for(Students i:staffes1.getStudent()) {
		 * studentsRepository.deleteById(i.getId()); }
		 */
		
		 staffesrepository.deleteById(id);
	}

	public Optional<Staffes> deleteByStaffesName(String staffesname) {
		// TODO Auto-generated method stub
		 return staffesrepository.deleteByStaffesname(staffesname);
	}
}
