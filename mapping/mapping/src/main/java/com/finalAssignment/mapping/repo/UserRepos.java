package com.finalAssignment.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalAssignment.mapping.entities.userentities;

@Repository
public interface UserRepos  extends JpaRepository<userentities, Integer> {

}
