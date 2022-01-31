package com.company;

// Memory Allocation and Initialization - Constructor

class Praveen{
    int x;
    String y;
    int age;
    public Praveen(int roll, String name){
        this.x = roll;
        this.y = name;
    }
    public Praveen(int x, String y, int age){
        this.x = x;
        this.y = y;
        this.age = age;
    }
    void showDetails(){
        System.out.println("Roll : "+ this.x);
        System.out.println("Name : "+ this.y);
        System.out.println("age ; "+ this.age);
    }
}

public class Main{
    public static void main(String[] args) {
        Praveen pj = new Praveen(53, "Praveen"); // sizeof(x) + sizeof(y)
        pj.showDetails();
        pj.y = "Chanti";
        pj.showDetails();
        Praveen pk = new Praveen(53,"Chanti",22);
        pk.showDetails();
    }
}