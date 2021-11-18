package com.Example;

import java.util.Scanner;

class Student{
    private int studentID;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Student(int studentID,String studentName, String studentAddress){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student(int studentID,String studentName, String studentAddress, String collegeName){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's id:");
        int id = sc.nextInt();
        System.out.println("Enter Student's Name:");
        String name = sc.next();
        System.out.println("Enter Student's address:");
        String addr = sc.next();
        String isNIT = "";
        while (!isNIT.equals("YES") && !isNIT.equals("yes") && !isNIT.equals("NO") && !isNIT.equals("no")) {
            if(!isNIT.equals(""))
                System.out.println("Wrong Input");
            System.out.println("Whether the student is from NIT(Yes/No):");
            isNIT = sc.next();
        }
        Student obj;
        String collegeName;
        if(!isNIT.equals("YES") && !isNIT.equals("yes")){
            System.out.println("Enter the college name:");
            collegeName = sc.next();
            obj = new Student(id, name, addr, collegeName);
        }else{
            obj = new Student(id, name, addr);
            obj.setCollegeName("NIT");
        }
        System.out.println("Student id:"+obj.getStudentID());
        System.out.println("Student name:"+obj.getStudentName());
        System.out.println("Address:"+obj.getStudentAddress());
        System.out.println("College name:"+obj.getCollegeName());
    }
}
