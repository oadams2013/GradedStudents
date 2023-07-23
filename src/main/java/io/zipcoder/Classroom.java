package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Classroom {
    private Student[] pupils;

    public Classroom(Student[] pupils) {
        this.pupils = pupils;
    }

    public Classroom(int maxNumberOfStudents) {
        this.pupils = new Student[maxNumberOfStudents];
    }

    public Classroom() {
        this.pupils = new Student[30];
    }

    public Student[] getPupils() {
        return pupils;
    }

    public Double getAverageExamScore() {
        Double sum = 0.0;
        for (Student student : pupils) {
            sum += student.getAverageExamScore();
        }
        return sum / pupils.length;
    }

    public void addStudent(Student student) {
        ArrayList<Student> arrayList = new ArrayList<>(Arrays.asList(pupils));
        arrayList.add(student);
        Student[] updatedArr = arrayList.toArray(new Student[0]);
        this.pupils = updatedArr;
    }

    public void removeStudent(String firstName, String lastName) {
        ArrayList<Student> update = new ArrayList<>(Arrays.asList(pupils));
        for (Student student : update) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                update.remove(student);
            }
        }
        Student[] updatedArr = update.toArray(new Student[0]);
        this.pupils = updatedArr;
    }

    public Student[] getStudentsByScore() {
        Collections.sort(pupils, new Comparator<Student>();

            @Override
            public int compare(Student pupils, Student pupil) {

                if (s1.getAverageScore() != s2.getAverageScore()) {
                    return Intger.compare(s2.getAverageScore(),s1.getAverageScore());
                }
                return s1.getFirstName().compareTo(s2.getFirstName());
            };
        });
        return pupils;
    }
}
