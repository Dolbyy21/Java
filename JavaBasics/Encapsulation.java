package com.JavaBasics;

class Student {
    private String name;
    private int rollno;

    public void setName(String name) {
        this.name = name;
        System.out.println("Changed name");
    }

    public String getName() {
        return name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
        System.out.println("Rollno changed");
    }

    public int getRollno() {
        return rollno;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Dolby");
        s1.setRollno(21);
        /*
         * System.out.println(s1.getName()); System.out.println(s1.getRollno());
         */

        System.out.println("Name of the student with rollno " + s1.getRollno() + " is " + s1.getName());
    }
}