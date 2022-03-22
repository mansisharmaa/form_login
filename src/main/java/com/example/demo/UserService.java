package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class UserService implements UserDetailsService
{
	@Autowired
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException 
	{
		User user = repo.findByName(name);
		if(user==null)
			throw new UsernameNotFoundException("user not found 404");
		
		return new UserImple(user);
	}
	

}
