package edu.icet.crm.service;

import edu.icet.crm.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getStudent();
    void addStudent(Student student);
    void deleteStudentById(Integer id);
    void updateStudent(Student student);
    Optional<Student> findStudentById(Integer id);
}
