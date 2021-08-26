package com.user.FormApplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.user.FormApplication.dto.ContactDTO;
import com.user.FormApplication.dto.CourseDTO;
import com.user.FormApplication.dto.FeedbackDTO;
import com.user.FormApplication.dto.UserDTO;
import com.user.FormApplication.entity.Course;
import com.user.FormApplication.entity.User;
import com.user.FormApplication.service.FormService;

@RestController
public class FormAppController {

	@Autowired
	FormService formService;

	@RequestMapping(value = "/course", method = RequestMethod.GET)
	public ModelAndView addNewCourse(ModelAndView model) {
		CourseDTO courseDto = new CourseDTO();
		model.addObject("course", courseDto);
		model.setViewName("course");
		return model;
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView addNewContact(ModelAndView model) {
		ContactDTO contactDto = new ContactDTO();
		model.addObject("contact", contactDto);
		model.setViewName("contact");
		return model;
	}

	@RequestMapping(value = "/feedback", method = RequestMethod.GET)
	public ModelAndView addNewFeedback(ModelAndView model) {
		FeedbackDTO feedbackDto = new FeedbackDTO();
		model.addObject("feedback", feedbackDto);
		model.setViewName("feedback");
		return model;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView addNewUser(ModelAndView model) {
		UserDTO userDto = new UserDTO();
		model.addObject("user", userDto);
		model.setViewName("user");
		return model;
	}

	@RequestMapping(value = "/savecourse", method = RequestMethod.POST)
	public ModelAndView addCourse(@ModelAttribute CourseDTO courseDto) {
		formService.addCourse(courseDto);
		return new ModelAndView("redirect:/index");
	}

	@RequestMapping(value = "/savecontact", method = RequestMethod.POST)
	public ModelAndView addContact(@ModelAttribute ContactDTO contactDto) {
		formService.addContact(contactDto);
		return new ModelAndView("redirect:/index");
	}

	@RequestMapping(value = "/savefeedback", method = RequestMethod.POST)
	public ModelAndView addFeedback(@ModelAttribute FeedbackDTO feedbackDto) {
		formService.addFeedback(feedbackDto);
		return new ModelAndView("redirect:/index");
	}

	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute UserDTO userDto) {
		System.out.println(userDto.toString());
		formService.addUser(userDto);
		return new ModelAndView("redirect:/index");
	}

	@RequestMapping(value = "/viewCourses", method = RequestMethod.GET)
	public ModelAndView viewAllCourses(ModelAndView model) {
		List<Course> courses = formService.getAllCourses();
		model.addObject("courses", courses);
		model.setViewName("courses");
		return model;
	}
	@RequestMapping(value = "/viewUsers", method = RequestMethod.GET)
	public ModelAndView viewAllUsers(ModelAndView model) {
		List<User> users = formService.getAllUsers();
		model.addObject("users", users);
		model.setViewName("users");
		return model;
	}

	@ModelAttribute("courseNames")
	public List<String> getCourseList() {
		List<Course> courseList = formService.getAllCourses();
		List<String> courseNames = new ArrayList<>();
		for (Course course : courseList) {
			courseNames.add(course.getCourseName());
		}
		return courseNames;
	}

	@ModelAttribute("usernames")
	public List<String> getUserList() {
		List<User> userList = formService.getAllUsers();
		List<String> usernames = new ArrayList<>();
		for (User user : userList) {
			usernames.add(user.getUsername());
		}
		return usernames;
	}

	@GetMapping("/index")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello");
		return mv;
	}
}
