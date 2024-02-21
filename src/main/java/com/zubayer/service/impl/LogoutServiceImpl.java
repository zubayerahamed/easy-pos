package com.zubayer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Service;

import com.zubayer.repo.TokenRepo;
import com.zubayer.service.LogoutService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
@Service
public class LogoutServiceImpl implements LogoutHandler, LogoutService {

	@Autowired private TokenRepo tokenRepo;

	@Override
	public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
		final String authHeader = request.getHeader("Authorization");
		final String jwt;
		if (authHeader == null || !authHeader.startsWith("Bearer ")) return;

		jwt = authHeader.substring(7);

		var storedToken = tokenRepo.findByToken(jwt).orElse(null);

		if (storedToken != null) {
			storedToken.setExpired(true);
			storedToken.setRevoked(true);
			//updateEntity(storedToken);
			SecurityContextHolder.clearContext();
		}
	}

}
