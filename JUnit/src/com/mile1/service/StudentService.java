package com.mile1.service;


import com.mile1.bean.Student;

public class StudentService {

    // Count students whose name is null
    public int findNumberOfNullName(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s != null && s.getName() == null) {
                count++;
            }
        }

        return count;
    }

    // Count null student objects
    public int findNumberOfNullObjects(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s == null) {
                count++;
            }
        }

        return count;
    }

    // Count students whose marks array is null
    public int findNumberOfNullMarksArray(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s != null && s.getMarks() == null) {
                count++;
            }
        }

        return count;
    }
}
