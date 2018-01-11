package derek.lewandowski.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControler {
	
	@Autowired
	private StudentService studentService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/student")
	public List<Student> getAllTopics() {
		return studentService.getAllTopics();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/student/{id}")
	public Student getTopic(@PathVariable String id) {
		return studentService.getTopic(id);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method=RequestMethod.POST, value="/student")
	public void addTopic(@RequestBody Student student) {
		studentService.addTopic(student);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method=RequestMethod.PUT, value="/student/{id}")
	public void updateTopic(@RequestBody Student student, @PathVariable String id) {
		studentService.updateTopic(id, student);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method=RequestMethod.DELETE, value="/student/{id}")
	public void deleteTopic(@PathVariable String id) {
		studentService.deleteTopic(id);
	}
}
