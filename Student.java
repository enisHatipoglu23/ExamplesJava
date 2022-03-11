package com.company;

public class Student extends Person{
    //STUDENT CLASS GETS PERSON CLASSES OBJECT VALUES OWING TO INHERITANCE
    private int[] testScore;
    public Student(String firstName, String lastName, int id, int[] testScore) {
        super(firstName, lastName, id);
        this.testScore = testScore;
    }
    public char calculate(){
        int sum = 0;
        for (int i = 0; i < testScore.length; i++){
            sum += testScore[i];
        }
        int average = sum / testScore.length;
        if (average >= 90 && average <= 100){
            return 'O';
        }
        if (average >= 80 && average < 90){
            return 'E';
        }
        if (average >= 70 && average < 80){
            return 'A';
        }
        if (average >= 55 && average < 70){
            return 'P';
        }
        if (average >= 40 && average < 55){
            return 'D';
        }
        if (average < 40){
            return 'T';
        }else{
            return Character.MIN_VALUE;
        }

    }

    public int[] getTestScore() {
        return testScore;
    }

    public void setTestScore(int[] testScore) {
        this.testScore = testScore;
    }
}
