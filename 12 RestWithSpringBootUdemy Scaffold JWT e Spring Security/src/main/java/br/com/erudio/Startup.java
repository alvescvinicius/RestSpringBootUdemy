package br.com.erudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class Startup {
	
	public static void main(String[] args) {
		
		SpringApplication.run(Startup.class, args);
		
		// Para gerar senha ao iniciar (testes)
		//BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		//String result = bCryptPasswordEncoder.encode("admin123");
		//System.out.println("My hash" + result);
		
	}
	
}