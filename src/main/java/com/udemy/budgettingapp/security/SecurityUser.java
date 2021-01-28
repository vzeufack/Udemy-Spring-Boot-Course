package com.udemy.budgettingapp.security;

import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import com.udemy.budgettingapp.domain.Authority;
import com.udemy.budgettingapp.domain.User;

public class SecurityUser extends User implements UserDetails{
	private static final long serialVersionUID = 1L;
   
	public SecurityUser() {
		
	}
	
	public SecurityUser(User user) {
		this.setAuthorities(user.getAuthorities());
		this.setBudgets(user.getBudgets());
		this.setId(user.getId());
		this.setPassword(user.getPassword());
		this.setUsername(user.getUsername());
	}

	@Override
	public Set<Authority> getAuthorities() {
		return super.getAuthorities();
	}

	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		return super.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
