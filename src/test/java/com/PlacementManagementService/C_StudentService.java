package com.PlacementManagementService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacementEntity.Certificate;
import com.PlacementEntity.Student;
import com.PlacementManagementRepository.CertificateRepository;
import com.PlacementManagementRepository.StudentRepository;
@Service
public class C_StudentService implements StudentService {
	@Autowired
	StudentRepository repo;
	CertificateRepository repo1;
	@Override
	public Student addStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public Student searchStudentById(long id,Student student) {
		Optional<Student>result=repo.findById(student.getId());
		return result.orElse(null);
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {
		return repo1.save(certificate);
	}

	@Override
	public Certificate updateCertificate(long id,Certificate certificate) {
		if(repo1.findById(id).isPresent()) {
			repo1.save(certificate);
		}
		System.out.println("Certificate Updated Sucessfully");
		return certificate;
	}

	@Override
	public boolean deleteStudent(long id) {
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
			System.out.println("Student Deleted Sucessfully");
			return true;
		}
		
		return false;
	}

	@Override
	public Student searchStudentByHallTicket(Student student,long id) {
		Optional<Student>result=repo.findById(student.getHallTicketNo());
		return result.orElse(null);
	}

	@Override
	public Student updateStudent(Student student, long id) {
		if(repo.findById(id).isPresent()) {
			repo.save(student);
		}
		System.out.println("Student Updated Sucessfully");		
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

}
