package com.JavaBasics;

abstract class Writer
{
    public abstract void show();        // This abstract method should be defined in the class which extends "Writer" class  

    public void writes()
    {
        System.out.println("Writes nicely");
    }
    // Getters and setters start from here 

    private String name;
    private Double length;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLength(Double length){
        this.length = length;
    }
    public Double getLength(){
        return length;
    }

}

class Pencil extends Writer
{   
    public void show()                  // This is where the abstract method show is defined 
    {
        System.out.println("Don't need ink");
    }
}

class Pen extends Writer
{
    public void show()                  // This is where the abstract method show is defined 
    {
        System.out.println("Needed Ink");
    }
}

public class Abstraction 
{
    public static void main(String[] args)
    {
        Writer w1 = new Pen();
        Writer w2 = new Pencil();

        w1.show();
        w2.show();
        w1.writes();

        w1.setName("Cello Faster ");
        w1.setLength(4.5);

        w2.setName("Apsara ");
        w2.setLength(5.5);

        System.out.println("The pen is "+w1.getName() + " with a length of "+w1.getLength());
        
        System.out.println("The pen is "+w2.getName() + " with a length of "+w2.getLength());

    }
    
}
