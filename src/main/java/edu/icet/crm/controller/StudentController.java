package edu.icet.crm.controller;

import edu.icet.crm.model.Student;
import edu.icet.crm.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
@Slf4j
@CrossOrigin
public class StudentController {

    private final StudentService service;

    @PostMapping("/add-student-with-image")
    public void addStudentWithImage(@RequestBody Student student) {
        log.info("Received Student: {}", student);
        service.addStudent(student);
    }

    @GetMapping("/get-student")
    public List<Student> getStudent() {
        return service.getStudent();
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteStudentById(@PathVariable Integer id) {
        service.deleteStudentById(id);
    }

    @PutMapping("/update-student")
    public void updateStudent(@RequestBody Student student) {
        service.updateStudent(student);
    }

    @GetMapping("/find-by-id/{id}")
    public Optional<Student> findStudentById(@PathVariable Integer id) {
        return service.findStudentById(id);
    }
}
