package com.gourisha.SpringBootStarter.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.gourisha.SpringBootStarter.model.Student;

@Repository("studentDaoImpl")
public class StudentDAOImpl implements StudentDAO {

	private final Map<UUID, Student> database;

	public StudentDAOImpl() {
		super();
		database = new HashMap<>();
		UUID studentId = UUID.randomUUID();
		database.put(studentId,
					new Student(studentId, 22, "Gourisha", "Hegde", "Advance CS")
				);
	}

	@Override
	public int insertNewStudent(UUID studentId, Student student) {
		database.put(studentId, student);
		return 1;
	}

	@Override
	public Student selectStudentById(UUID studentId) {
		return database.get(studentId);
	}

	@Override
	public List<Student> selectAllStudents() {
		return new ArrayList<>(database.values());
	}

	@Override
	public int updateStudentById(UUID studentId, Student updatedStudent) {
		database.put(studentId, updatedStudent);
		return 1;
	}

	@Override
	public int deleteStudentById(UUID studentId) {
		database.remove(studentId);
		return 1;
	}

}
