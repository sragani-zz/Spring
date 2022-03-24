package com.finalAssignment.mapping.services;

import java.util.List;
import java.util.Optional;

import com.finalAssignment.mapping.entities.Designationentities;

public interface DesignationImplement {
	public List<Designationentities>getDesignations();

	public Optional<Designationentities> getDesignation(int designationId);

	public void addDesignation(Designationentities designation);


	public void updateDesignation(Designationentities designation);


	public void deleteDesignation(int designationId);
	}

