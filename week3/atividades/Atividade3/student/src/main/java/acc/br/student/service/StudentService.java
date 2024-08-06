package acc.br.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import acc.br.student.model.Student;
import acc.br.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	// GET All Students
	@Transactional(readOnly = true)
	public List<Student> getAllStudents(){
		return repository.findAll();
	}
	// GET student by id
	@Transactional(readOnly = true)
	public Optional<Student> getStudentById(Long id) {
		return repository.findById(id);
	}
	// POST student 
	@Transactional
	public Student save(Student student) {
		return repository.save(student);
	}
	// PUT student
	public Optional<Student> update(Long id, Student studentDetails) {
        return repository.findById(id).map(student -> {
            student.setName(studentDetails.getName());
            student.setAge(studentDetails.getAge());
            student.setEmail(studentDetails.getEmail());
            return repository.save(student);
        });
    }
	
	// DELETE student
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	
}
