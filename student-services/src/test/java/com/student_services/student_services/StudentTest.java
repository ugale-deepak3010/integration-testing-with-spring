package com.student_services.student_services;

import static org.assertj.core.api.BDDAssertions.then;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.student_services.student_services.Model.Student;
import com.student_services.student_services.Repository.StudentRepo;

@DataJpaTest
public class StudentTest {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    TestEntityManager testEntityManager;

    @Test
    public void testStudentName(){

        Student savedStudent= testEntityManager.persistFlushFind(new Student(null,"Deepak",true,100));
                //studentRepo.save(new Student(null,"Deepak",null,null));

        Student student= studentRepo.findByName("Deepak");
        System.out.println("----------------started");
        
        then("Hello").isNotNull();

        then(student.getName()).isEqualTo(savedStudent.getName());
    }

    @Test
    public void testAvgScore(){

        Student mark= new Student(null,"mark",true,80);
        Student susan= new Student(null,"susan",false,100);
        Student peter= new Student(null,"peter",false,50);

        Arrays.asList(mark,susan,peter).forEach(testEntityManager::persistFlushFind);

        Double avg= studentRepo.getAvgGradeForActiveStudent();
        then(avg).isEqualTo(80);
    }
    
}
