package com.mile1.main;


import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

public class StudentMain {

    public static void main(String[] args) {

        Student s = new Student("John", new int[] {70, 80, 90});

        StudentReport report = new StudentReport();

        try {
            if (report.validate(s).equals("VALID")) {
                System.out.println("Grade : " + report.findGrades(s));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
