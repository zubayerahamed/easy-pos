package com.zubayer.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
@OpenAPIDefinition(
	info = @Info(
		contact = @Contact(
			name = "Zubayer Ahamed", 
			email = "zubayerahamed1990@gmail.com", 
			url = "https://github.com/zubayerahamed"
		), 
		description = "OpenApi documentation for Easy POS", 
		title = "Easy POSr", 
		version = "1.0.0", 
		license = @License(
			name = "MIT", 
			url = "https://github.com/zubayerahamed"
		), 
		termsOfService = "Terms of service"
	), 
	servers = {
		@Server(description = "Local ENV", url = "http://localhost:2021"),
		@Server(description = "PROD ENV", url = "https://178.238.224.154:2021/easypos") 
	}, 
	security = {
		@SecurityRequirement(name = "bearerAuth") 
	}
)
@SecurityScheme(
	name = "bearerAuth", 
	description = "JWT auth description", 
	scheme = "bearer", 
	type = SecuritySchemeType.HTTP, 
	bearerFormat = "JWT", 
	in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}
