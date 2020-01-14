package ynov.ihcen.firstclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FirstclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstclientApplication.class, args);
	}

}
