package com.gourisha.SpringBootStarter.dao;

import java.util.List;
import java.util.UUID;

import com.gourisha.SpringBootStarter.model.Student;

public interface StudentDAO {

	int insertNewStudent(UUID studentId, Student student);

	Student selectStudentById(UUID studentId);

	List<Student> selectAllStudents();

	int updateStudentById(UUID studentId, Student updatedStudent);

	int deleteStudentById(UUID studentId);

}
