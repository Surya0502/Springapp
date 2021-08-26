package com.user.FormApplication.dto;

public class UserDTO {

	private int userId;

	private String username;

	private String password;

	private String address;

	private String course;

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDTO(int userId, String username, String password, String address, String course) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.address = address;
		this.course = course;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", username=" + username + ", password=" + password + ", Address="
				+ address + ", course=" + course + "]";
	}

}
