package com.company;

/**
 * Created by jg101 on 11/10/16.
 */
public class HighSchool {
    private Student [] students;

    public HighSchool(Student [] stu){

        students = stu;

    }

    public Student getValedictorian()

    {


    }

// returns the percentage of students in the

// honors program

    public double getHonorsPercentage()

    {
        int c = 0;
        for (int i = 0; i < students.length; i++)

            if (students[i].isHonors())
                c++;
        double perent = (c/students.length)*100;

        return perent;
    }
}
