package com.uniquesystem.hrms;
/*
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.uniquesystem.hrms.service.EmailService;
import com.uniquesystem.hrms.util.email.Email;
import com.uniquesystem.hrms.util.email.EmailTemplate;

@Component
public class AppMailSender implements ApplicationRunner{

	@Autowired
	EmailService emailService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
	    sendHTMLMail();
	}

	private void sendHTMLMail() {
		String strFrom    = "saravanan@uniquesystem";
		String strTo      = "sarav@uniquesystem";
		String strSubject = "Java Mail Spring Boot";
		
		EmailTemplate template=new EmailTemplate("hello-world.html");
		Map<String,String> replacements=new HashMap<String,String>();
		replacements.put("user", "Saravanan");
		replacements.put("today", String.valueOf(new Date()));
		String message =template.getTemplate(replacements);
		Email email =new Email(strFrom,strTo,strSubject,message);
		email.setHtml(true);
		emailService.send(email);+
	}
}
*/