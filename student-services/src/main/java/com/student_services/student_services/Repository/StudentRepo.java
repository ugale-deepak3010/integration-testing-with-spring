package com.student_services.student_services.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student_services.student_services.Model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

    Student findByName(String name);

    @Query("select avg(grade) from Student where active=true")
    Double getAvgGradeForActiveStudent();
}
