package derek.lewandowski.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllTopics(){
		List<Student> students = new ArrayList<>();
		studentRepository.findAll()
		.forEach(students::add);
		return students;
	}
	
	public Student getTopic(String id) {
		return studentRepository.findOne(id);
	}

	public void addTopic(Student student) {
		studentRepository.save(student);
	}
	
	public void updateTopic(String id, Student student) {
		studentRepository.save(student);
	}
	
	public void deleteTopic(String id) {
		studentRepository.delete(id);
	}
}
