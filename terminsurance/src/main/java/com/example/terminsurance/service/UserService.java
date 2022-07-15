package com.example.terminsurance.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.terminsurance.repo.*;
import com.example.terminsurance.data.UserBean;

@Service
public class UserService {

	@Autowired
	private UserRepo userrepo;
	
	
		public UserBean addUser(UserBean userbean) {

			return  userrepo.save(userbean);
		}
}
