package com.user.FormApplication.service;

import java.util.List;

import com.user.FormApplication.dto.ContactDTO;
import com.user.FormApplication.dto.CourseDTO;
import com.user.FormApplication.dto.FeedbackDTO;
import com.user.FormApplication.dto.UserDTO;
import com.user.FormApplication.entity.Contact;
import com.user.FormApplication.entity.Course;
import com.user.FormApplication.entity.Feedback;
import com.user.FormApplication.entity.User;

public interface FormService {

	public User addUser(UserDTO userDto);

	public Contact addContact(ContactDTO contactDto);

	public Feedback addFeedback(FeedbackDTO feedbackDto);

	public Course addCourse(CourseDTO courseDto);

	public List<User> getAllUsers();

	public List<ContactDTO> getAllContacts();

	public List<FeedbackDTO> getAllFeedbacks();

	public List<Course> getAllCourses();

}
