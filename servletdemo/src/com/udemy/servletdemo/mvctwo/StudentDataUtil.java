package com.udemy.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil
{
    public static List<Student> getStudents() {
        
        List<Student> students = new ArrayList<>();
        
        students.add(new Student("Shankar", "Venkat", "shankar@gmail.com"));
        students.add(new Student("Uma", "Shankar", "uma@gmail.com"));
        students.add(new Student("Vaibhav", "Srikanta", "vaibhav@gmail.com"));
        
        return students;
    }
}
