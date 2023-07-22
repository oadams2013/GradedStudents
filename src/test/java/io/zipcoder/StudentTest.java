package io.zipcoder;

import org.junit.Test;

public class StudentTest {
    @Test
    public void getExamScoresTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores ={100.0, 95.0,123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);
        String output = student.getExamScores();
        student.addExamScores(45);
        student.setExamScore(1, 150.0);
        Double output2 = student.getAverageExamScore();
        System.out.println(output);
    }

}