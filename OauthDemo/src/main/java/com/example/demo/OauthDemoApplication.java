package com.example.demo;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
class OauthDemoApplication {
	@GetMapping
	public String mssg(Principal principal) {
		return "hello" +" "+ principal.getName()+" "+"welcome to OAuth applicaion";
	}
	public static void main(String[] args) {
		SpringApplication.run(OauthDemoApplication.class, args);
	}

}
