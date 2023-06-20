package com.dxc.model;

public class UserCredential {
	private String userId;
	private String userPassword;
	public UserCredential() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserCredential(String userId, String userPassword) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "UserCredential [userId=" + userId + ", userPassword=" + userPassword + "]";
	}
	
	
}
