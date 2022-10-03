package com.example.crudwithoutdb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceStub {

    private static Map<Long, Student> students = new HashMap<>();
    private static Long index = 1L;

    static {
        Student student1 = new Student(1L, "Rituraj", "1941012660", 2023L);
        students.put(1L, student1);
    }

    public static List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public static Student getStudentDetails(Long StudentId) {
        return students.get(StudentId);
    }

    public static Student addStudent(Student student) {
        index += 1;
        student.setId(index);
        students.put(index, student);
        return student;
    }

    public static Student updateStudent(Long studentId, Student student) {
        student.setId(studentId);
        students.put(studentId, student);
        return student;
    }

    public static Student deleteStudent(Long studentId) {
        return students.remove(studentId);
    }
}
