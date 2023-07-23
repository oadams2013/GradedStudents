package io.zipcoder;
import org.junit.jupiter.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {
    @Test
            public void averageTest() {
        // : Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);
    }
    @Test
            public void addStudentTest() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getPupils();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getPupils();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }
    @Test
    public void removeStudentTest(){
        //given
        Student student = new Student("Brent", "Brent", new Double[]{15.2,22.0,100.0});
        Student student2 = new Student("Bob", "bob", new Double[]{15.2,22.0,100.0});
        Student[] students = new Student[]{student,student2};
        Classroom classroom = new Classroom(students);

        //when
        System.out.println(classroom.toString());
        classroom.removeStudent("Bob", "bob");
        System.out.println(classroom.toString());

        //then
    }
    @Test
    public void getStudentByScoreTest(){

        //given
      //  Student student = new Student("Brent", "Brent", new Double[]{15.2,22.0,100.0});
     //   Student student2 = new Student("Bob", "bob", new Double[]{15.2,22.0,100.0});
    //    Student[] students = new Student[]{student,student2};
    //    Classroom classroom = new Classroom(students);

        //when
    //    System.out.println(classroom.toString());
    //    classroom.getStudentsByScore();
    //    System.out.println(classroom.toString());

        //then
        Student student = new Student("Brent", "Brent", new Double[]{15.2,22.0,100.0});
        Student student2 = new Student("Bob", "bob", new Double[]{15.2,22.0,100.0});

        Classroom classroom = new Classroom();
        classroom.addStudent(student);
        classroom.addStudent(student2);

        Student[] expectedOrder = {student2, student};
        Student[] actualOrder = classroom.getStudentsByScore();


        Assertions.assertArrayEquals(expectedOrder, actualOrder);
    }
}
