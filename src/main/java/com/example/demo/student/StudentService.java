package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Service
public class StudentService {
    public List<Student> getStudents()
    {
        return List.of(
                new Student(
                        1L,
                        "Sharan",
                        "sharan@gmail.com",
                        LocalDate.of(2000,JANUARY,5),
                        21
                )
        );
    }
}
