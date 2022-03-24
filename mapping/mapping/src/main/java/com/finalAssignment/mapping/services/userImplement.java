
package com.finalAssignment.mapping.services;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalAssignment.mapping.entities.userentities;
import com.finalAssignment.mapping.repo.UserRepos;



@Service
public class userImplement implements userService {

	
	@Autowired	
	private UserRepos userDao;

	@Override
	public List<userentities> getUsers() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public Optional<userentities> getUser(int userId) {
		// TODO Auto-generated method stub
		return userDao.findById(userId);
	}

	@Override
	public void addUser(userentities user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Override
	public void updateUser(userentities user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		userentities dUserentities=userDao.getOne(userId);
		userDao.delete(dUserentities);
		
	}
}
