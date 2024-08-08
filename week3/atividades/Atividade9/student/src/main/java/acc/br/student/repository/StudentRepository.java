package acc.br.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import acc.br.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
