package com.company;

/**
 * Created by jg101 on 11/10/16.
 */
public class Student {
    private boolean isHonors;
    private double gpa;
    public String name;

    public Student(String n,boolean h,double g){
        name = n;
        isHonors = h;
        gpa = g;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isHonors() {
        return isHonors;
    }
}
