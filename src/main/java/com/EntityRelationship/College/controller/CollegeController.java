package com.EntityRelationship.College.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EntityRelationship.College.entity.Staffes;
import com.EntityRelationship.College.service.CollegeService;

@RestController
@RequestMapping("/api/staffes")
public class CollegeController {
	
	@Autowired
	CollegeService collegeservice;
	
	@PostMapping("/post")
	public Staffes store (@RequestBody Staffes staffes) {
		return collegeservice.store(staffes);
	}
	
	@PostMapping("/listpost")
	public List<Staffes> listPost(@RequestBody List<Staffes> staffes){
		return collegeservice.listPost(staffes);
	}
	
	@GetMapping("/getstaffes/{id}")
	public Optional<Staffes> getStaffes(@PathVariable("id") int id) {
		return collegeservice.getById(id);
	}
	
	@PutMapping ("/update")
	public Staffes update(@RequestBody Staffes staffes ){
		return collegeservice.update(staffes);
	}
	
	@DeleteMapping ("/delete/{id}")
	public void delete(@PathVariable ("id") int id){
		collegeservice.deleteid(id);
	}
	
	@Transactional
	@DeleteMapping("/deleteByName/{staffesname}")
	public Optional<Staffes> deleteBysStaffesName(@PathVariable ("staffesname") String staffesname) {
		 return collegeservice.deleteByStaffesName(staffesname);
	}

}
