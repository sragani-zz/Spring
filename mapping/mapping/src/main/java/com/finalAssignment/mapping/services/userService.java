package com.finalAssignment.mapping.services;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;

import com.finalAssignment.mapping.entities.userentities;

public interface userService {
	public List<userentities>getUsers();

	public Optional<userentities> getUser(int userId);

	public void addUser(userentities user);

	public void updateUser(userentities user);



	public void deleteUser(int userId);
}
