package com.yg_prvn.REST_APIs_Practices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.yg_prvn.REST_APIs_Practices.model.Student;

@Service
public class StudentService {
    
    private final List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1, "Yuga Praveen"));
        students.add(new Student(2, "Suhail Ahemad"));
        students.add(new Student(3, "Nandha Kumar"));
    }

    public List<Student> getAllStudents() {
        return students;
    }
    
    public Optional<Student> getStudentById(int id) {
        return students.stream().filter(students -> students.getId() == id).findFirst();
    }

    public Student addStudent(Student student) {
        student.setId(students.size() + 1);
        students.add(student);
        return student;
    }

    public Student updateStudent(int id, Student updatedStudent) {
        Optional<Student> studentOptional = getStudentById(id);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            student.setName(updatedStudent.getName());
            return student;
        }
        return null;
    }

    public boolean deleteStudent(int id) {
        return students.removeIf(students -> students.getId() == id);
    }
}
