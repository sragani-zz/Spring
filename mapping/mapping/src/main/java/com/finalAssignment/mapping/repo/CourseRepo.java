package com.finalAssignment.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalAssignment.mapping.entities.Courseentities;
@Repository
public interface CourseRepo extends JpaRepository<Courseentities, Integer>{

}
