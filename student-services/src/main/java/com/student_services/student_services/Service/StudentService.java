package com.student_services.student_services.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student_services.student_services.Model.Student;
import com.student_services.student_services.Repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public Student getStudentById(Long id){

        return studentRepo.findById(id).orElse(null);
    }
}
