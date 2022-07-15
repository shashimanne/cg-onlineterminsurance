package com.example.terminsurance.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.terminsurance.service.*;

import com.example.terminsurance.data.*;
  
@RestController
public class AdminController {
	
		@Autowired
		AdminService admin;

		   	  
	   		@PostMapping(value= "/admin/addcustomer")
	   	    public String addCustomer(@RequestBody AdminBean adminbean)
	   	  {
	   			
	   			admin.addCustomer(adminbean);
	   			return "Created successfully";
	   	   }


}
