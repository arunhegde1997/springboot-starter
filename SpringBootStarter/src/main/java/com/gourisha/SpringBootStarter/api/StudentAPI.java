package com.gourisha.SpringBootStarter.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gourisha.SpringBootStarter.model.Student;
import com.gourisha.SpringBootStarter.service.StudentService;

@RestController
@RequestMapping("api/v1/students")
public class StudentAPI {

	private final StudentService studentService;

	@Autowired
	public StudentAPI(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, path = "{studentId}")
	public Student getStudentById(@PathVariable("studentId") UUID studentId) {
		return studentService.getStudentById(studentId);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertNewStudent(@RequestBody Student student) {
		studentService.persistNewStudent(UUID.randomUUID(), student);
	}
}
