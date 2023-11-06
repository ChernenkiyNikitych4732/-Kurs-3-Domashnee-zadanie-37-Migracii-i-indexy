package sky.pro.course3.homework.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sky.pro.course3.homework.model.Student;
import sky.pro.course3.homework.repoistory.StudentRepository;

import java.util.Collection;


@Service
public class StudentService {
    Logger logger = LoggerFactory.getLogger(StudentService.class);
    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student createStudent(Student student) {
        logger.info("Was invoked method for create student");
        return studentRepository.save(student);
    }
    public Student findStudent(long id) {
        logger.info("Was invoked method for find student");
        return studentRepository.findById(id).get();
    }
    public Student editStudent(Student student) {
        logger.info("Was invoked method for edit student");
        return studentRepository.save(student);
    }
    public void deleteStudent(Long id) {
        logger.info("Was invoked method for delete student");
        studentRepository.deleteById(id);
    }
    public Collection<Student> getAllStudents() {
        logger.info("Was invoked method for get all students");
        return studentRepository.findAll();
    }
    public Collection<Student> findStudentsByAge(int min, int max) {
        logger.info("Was invoked method for find students by age");
        return studentRepository.findByAgeBetween(min, max);
    }
    public Integer findAllStudentsInSchool() {
        logger.info("Was invoked method for find all students in school");
        return studentRepository.findAllStudentsInSchool();
    }
    public Integer findAverageAgeStudents() {
        logger.info("Was invoked method for find average age students");
        return studentRepository.findAverageAgeStudents();
    }
    public Collection<Student> findLastFiveStudents() {
        logger.info("Was invoked method for find last five students");
        return studentRepository.findLastFiveStudents();
    }
}