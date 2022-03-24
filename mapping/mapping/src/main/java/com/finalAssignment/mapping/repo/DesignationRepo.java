package com.finalAssignment.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalAssignment.mapping.entities.Designationentities;

@Repository
public interface DesignationRepo extends JpaRepository<Designationentities, Integer>{

}
