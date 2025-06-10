package week6;

import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Nikhil", 85));
        students.add(new Student("Rahul", 78));
        students.add(new Student("Sneha", 92));
        students.add(new Student("Meena", 74));
        students.add(new Student("Arjun", 88));

        int total = 0;
        for (Student s : students) {
            total += s.marks;
        }

        double average = total / (double) students.size();
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

