package com.uniquesystem.hrms.web.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniquesystem.hrms.model.User;
import com.uniquesystem.hrms.repository.UserRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
public class HrmsLoginController {
@Autowired
	UserRepository userRep;
	@RequestMapping("/test")
	public String Test() {
		return "hi";
	}
	
	
	@GetMapping("/pass/{name}/{password}")
	public boolean getPassword(@PathVariable (value="name") String name,@PathVariable (value="password") String password) {
		
		//boolean status=false;
     User pass=	userRep.findByuserName(name);
	 // System.out.println(pass.getPassword());
      String username=pass.getUserName();
      String p  = pass.getPassword();
       
     if(name.equals(username)&&password.equals(p)) {
    	 return true;
     } else {
    	  return false;
      }
     }
}
