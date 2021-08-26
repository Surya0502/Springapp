package com.user.FormApplication.dto;

public class FeedbackDTO {

	private String user;

	private String Feedback;

	public FeedbackDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FeedbackDTO(String user, String feedback) {
		super();
		this.user = user;
		Feedback = feedback;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getFeedback() {
		return Feedback;
	}

	public void setFeedback(String feedback) {
		Feedback = feedback;
	}

	@Override
	public String toString() {
		return "FeedbackDTO [user=" + user + ", Feedback=" + Feedback + "]";
	}

}
