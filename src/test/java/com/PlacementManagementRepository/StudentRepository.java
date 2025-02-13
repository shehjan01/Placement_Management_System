package com.PlacementManagementRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PlacementEntity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(long id);
	public Student searchStudentByHallTicket(long ticketNo);
	public boolean deleteStudent(long id);
}
