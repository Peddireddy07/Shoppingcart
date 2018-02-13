package com.sigma.shoppingcart.entity;

import java.io.Serializable;

public class Account implements Serializable {
	
	private static final long serialVersionUID = 405211L;
	
	
	private String Username;
	private boolean active;
	private String password;
	private String Userrole;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserrole() {
		return Userrole;
	}
	public void setUserrole(String userrole) {
		Userrole = userrole;
	}
	@Override
	public String toString() {
		return "Account [Username=" + Username + ", active=" + active + ", password=" + password + ", Userrole="
				+ Userrole + "]";
	}
	
	
	

}
