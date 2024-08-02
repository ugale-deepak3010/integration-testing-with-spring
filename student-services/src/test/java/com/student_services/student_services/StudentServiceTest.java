package com.student_services.student_services;

import static org.assertj.core.api.BDDAssertions.then;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.student_services.student_services.Model.Student;
import com.student_services.student_services.Repository.StudentRepo;
import com.student_services.student_services.Service.StudentService;

import jakarta.transaction.Transactional;

@SpringBootTest(webEnvironment=WebEnvironment.NONE)
@Transactional
public class StudentServiceTest {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    StudentService studentService;
    
    // we can't use here in @SpringBootTest
    //TestEntityManager testEntityManager2;
    
    @DisplayName("Checking Student ID")
    @Test
    void testStudentId(){

        //given
        Student savedStudent= studentRepo.save(new Student(null, "Deepu", false, 80));
        
        //when
        Student student= studentService.getStudentById(savedStudent.getId());

        //then
        then(student.getId()).isEqualTo(savedStudent.getId());
    }
}
