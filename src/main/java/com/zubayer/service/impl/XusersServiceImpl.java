package com.zubayer.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.zubayer.service.XusersService;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
@Service
public class XusersServiceImpl implements XusersService, UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
