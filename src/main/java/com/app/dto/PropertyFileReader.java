package com.app.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties
public class PropertyFileReader 
{
	@Value("${pdf.dirPlace}")
	private String dirPlace;

	@Value("${spring.mail.username}")
	private String email;
}
