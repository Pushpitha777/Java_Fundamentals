package com.mile1.test;


import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentTest {

    public static void main(String[] args) {

        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        Student[] s = new Student[10];

        s[0] = new Student("A1", new int[] {72, 73, 74});
        s[1] = new Student("B1", new int[] {75, 76, 77});
        s[2] = new Student("C1", new int[] {99, 99, 99});
        s[3] = new Student("C3", new int[] {100, 100, 99});
        s[4] = new Student("B2", new int[] {13, 88, 13});
        s[5] = new Student("C2", new int[] {14, 14, 99});
        s[6] = new Student("A2", new int[] {77, 55, 12});
        s[7] = new Student(null, new int[] {13, 88, 13});
        s[8] = new Student("A3", null);
        s[9] = null;

        System.out.println("TC1 to TC6");

        for (int i = 0; i < s.length; i++) {

            try {

                if (report.validate(s[i]).equals("VALID")) {
                    System.out.println("Student " + i + " Grade : " + report.findGrades(s[i]));
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println();

        System.out.println("TC7");
        System.out.println("Null Name Count : " + service.findNumberOfNullName(s));

        System.out.println();

        System.out.println("TC8");
        System.out.println("Null Object Count : " + service.findNumberOfNullObjects(s));

        System.out.println();

        System.out.println("TC9");
        System.out.println("Null Marks Count : " + service.findNumberOfNullMarksArray(s));
    }
}
