package com.zubayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
@SpringBootApplication
public class EasyPosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyPosApplication.class, args);
	}

	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
