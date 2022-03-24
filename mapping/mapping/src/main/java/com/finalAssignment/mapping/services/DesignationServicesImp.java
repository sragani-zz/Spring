package com.finalAssignment.mapping.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalAssignment.mapping.entities.Designationentities;
import com.finalAssignment.mapping.repo.DesignationRepo;



//import com.finalAssignment.mapping.entities.Designationentities;
//import com.finalAssignment.mapping.repo.DesignationRepo;

//import com.finalAssignment.mapping.entities.Designationentities;
//import com.finalAssignment.mapping.repo.CourseRepo;
//import com.finalAssignment.mapping.repo.DesignationRepo;

@Service
public class DesignationServicesImp implements DesignationImplement{

	@Autowired
	private DesignationRepo designationRepo;
	@Override
	public List<Designationentities> getDesignations() {
		// TODO Auto-generated method stub
		return designationRepo.findAll();
	}

	@Override
	public Optional<Designationentities> getDesignation(int designationId) {
		// TODO Auto-generated method stub
		return designationRepo.findById(designationId);
	}

	@Override
	public void addDesignation(Designationentities designation) {
		// TODO Auto-generated method stub
		
		designationRepo.save(designation);
	}

	@Override
	public void updateDesignation(Designationentities designation) {
		// TODO Auto-generated method stub
		
		designationRepo.save(designation);
	}

	@Override
	public void deleteDesignation(int designationId) {
		// TODO Auto-generated method stub
		Designationentities designationentities= designationRepo.getOne(designationId);
		designationRepo.delete(designationentities);
	}
	
	
}
