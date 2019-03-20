package com.uniquesystem.hrms.service;

import com.uniquesystem.hrms.model.Email;

public interface EmailService {

	public void send(Email eparams);
	
	public void save(Email eParams);
}
