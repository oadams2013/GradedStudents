package io.zipcoder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private List<Double> examScores;
    public Student(String firstName, String lastName,Double[] examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList(Arrays.asList(examScores));
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }
    public String getExamScores(){
        StringBuilder string = new StringBuilder();
        string.append("Exam Scores: \n");
        for (int i = 0; i < examScores.size(); i++) {
            string.append(String.format("Exam %d -> %.0f\n", i +1, examScores.get(i)));

        }
        return string.toString();
    }
    public int getNumberOfExamScores(){
        return examScores.size();
    }
    public void addExamScores(double examScore){
        examScores.add(examScore);
    }
    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber -1, newScore);
    }
    public double getAverageExamScore(){
        Double sum = 0.0;
            for (Double i: examScores){
                sum += i;

            }
            return sum / examScores.size();
    }
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Student Name: ").append(firstName).append(" ").append(lastName);
        string.append("\nAverage Score: ").append(getAverageExamScore());
        string.append(getExamScores());

        return string.toString();
    }
}
