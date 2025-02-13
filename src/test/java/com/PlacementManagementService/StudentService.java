package com.PlacementManagementService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PlacementEntity.Certificate;
import com.PlacementEntity.Student;

@Service
public interface StudentService {
	public Student addStudent(Student student);  // C
	public Student updateStudent(Student student,long id);  // U
	public Student searchStudentById(long id,Student student);  // R

	public Student searchStudentByHallTicket(Student student,long id); // R

	public Certificate addCertificate(Certificate certificate); // C
	public Certificate updateCertificate(long id,Certificate certificate); // U
	public boolean deleteStudent(long id); // D
	public List<Student> getAllStudents();
}
