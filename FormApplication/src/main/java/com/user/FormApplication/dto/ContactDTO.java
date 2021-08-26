package com.user.FormApplication.dto;

public class ContactDTO {

	private String user;

	private String phoneNumber;

	private String Email;

	private String message;

	public ContactDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactDTO(String user, String phoneNumber, String email, String message) {
		super();
		this.user = user;
		this.phoneNumber = phoneNumber;
		Email = email;
		this.message = message;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ContactDTO [user=" + user + ", phoneNumber=" + phoneNumber + ", Email=" + Email + ", message="
				+ message + "]";
	}

}
