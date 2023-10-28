package com.stgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class StgPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(StgPetClinicApplication.class, args);
		System.out.println("Hello Spring");
	}

}
