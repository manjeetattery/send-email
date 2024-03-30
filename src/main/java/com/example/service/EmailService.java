package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.EmailDetails;

@Service
public interface EmailService {
	String sendSimpleMail(EmailDetails detailsDto);

	 String sendMailWithAttachment(EmailDetails detailsDto) ;
}
