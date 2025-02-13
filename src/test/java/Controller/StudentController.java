package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PlacementEntity.Student;
import com.PlacementManagementService.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/Students")
	public List<Student> getAllStudents() {
		
		return service.getAllStudents();
	}
	
	@GetMapping("/Student/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Long id) {
		
		return new ResponseEntity<Student>(service.searchStudentById(id, null), HttpStatus.OK);
	}
	
	@PostMapping("/Students")
	public void add(@RequestBody Student p) {
		
		service.addStudent(p);
	}
	
	@PutMapping("/Student/{id}")
	public void update(@PathVariable Long id, @RequestBody Student p) {
		
		service.updateStudent(p, id);
	}
	
	@DeleteMapping("/Student/{id}")
	public void delete(@PathVariable Long id) {
		
		service.deleteStudent(id);
	}
	
	
}
