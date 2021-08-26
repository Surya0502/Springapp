package com.user.FormApplication.service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.FormApplication.dto.ContactDTO;
import com.user.FormApplication.dto.CourseDTO;
import com.user.FormApplication.dto.FeedbackDTO;
import com.user.FormApplication.dto.UserDTO;
import com.user.FormApplication.entity.Contact;
import com.user.FormApplication.entity.Course;
import com.user.FormApplication.entity.Feedback;
import com.user.FormApplication.entity.User;
import com.user.FormApplication.repository.ContactRepository;
import com.user.FormApplication.repository.CourseRepository;
import com.user.FormApplication.repository.FeedbackRepository;
import com.user.FormApplication.repository.UserRepository;

@Service
public class FormServiceImpl implements FormService {

	ModelMapper mapper = new ModelMapper();

	@Autowired
	ContactRepository contactRepo;

	@Autowired
	CourseRepository courseRepo;

	@Autowired
	FeedbackRepository feedbackRepo;

	@Autowired
	UserRepository userRepo;

	@Override
	public User addUser(UserDTO userDto) {
		User user = mapper.map(userDto, User.class);
		Set<Course> courses = new HashSet<>();
		courses.add(courseRepo.findCourseByName(userDto.getCourse()));
		user.setCourses(courses);
		user.setRegistrationDate(LocalDate.now());
		userRepo.save(user);
		return user;
	}

	@Override
	public Contact addContact(ContactDTO contactDto) {
		User user = userRepo.findUserByName(contactDto.getUser());
		Contact contact = mapper.map(contactDto, Contact.class);
		contact.setUser(user);
		System.out.println(contact.toString());
		System.out.println(contactDto.toString());
		contactRepo.save(contact);
		return contact;
	}

	@Override
	public Feedback addFeedback(FeedbackDTO feedbackDto) {
		User user = userRepo.findUserByName(feedbackDto.getUser());
		Feedback feedback = mapper.map(feedbackDto, Feedback.class);
		feedback.setUser(user);
		System.out.println(feedbackDto.toString());
		feedbackRepo.save(feedback);
		return feedback;
	}

	@Override
	public Course addCourse(CourseDTO courseDto) {
		Course course = mapper.map(courseDto, Course.class);
		courseRepo.save(course);
		return course;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = userRepo.findAll();
		System.out.println(users.toString());
		return users;
	}

	@Override
	public List<ContactDTO> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FeedbackDTO> getAllFeedbacks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		List<Course> courses = courseRepo.findAll();
		System.out.println(courses.toString());
		return courses;
	}

}
