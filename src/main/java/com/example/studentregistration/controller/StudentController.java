package com.example.studentregistration.controller;

import java.util.List;

import com.example.studentregistration.model.Student;
import com.example.studentregistration.model.StudentDto;
import com.example.studentregistration.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/getallstudents")
    public List<Student> getallstudents()
    {
        return studentRepository.findAll();
    }

    @PostMapping("/addstudent")
    public void addStudent(@RequestBody StudentDto studentDto)
    {
        Student student = new Student();
        student.setName(studentDto.getName());
        student.setAge(studentDto.getAge());
        studentRepository.save(student);
    }

    @GetMapping("/")
    public ResponseEntity<String> hello()
    {
        return ResponseEntity.ok("Hello from StudentController");
    }
    
    
}
