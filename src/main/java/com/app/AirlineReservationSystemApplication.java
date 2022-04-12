package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.app.dto.PropertyFileReader;

@SpringBootApplication(scanBasePackages = { "com.app.*" })
@EnableConfigurationProperties({ PropertyFileReader.class })
@EnableJpaRepositories("com.app.dao")
@EntityScan("com.app.pojos")
public class AirlineReservationSystemApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(AirlineReservationSystemApplication.class, args);
	}
}
