package com.JavaBasics;

class Emp{
    int employeeId;
    int salary;
    static String company;         // In this case we will use same company for every employee

    static {                // Static block will be called when a class is loaded
        company = "TCS";
        System.out.println("This is a static block ");
    } 

    public Emp(){           // Constructor block is called when an object is created
        employeeId = 1;
        salary = 4000;
        System.out.println("This is a constructor block ");
    }

    public void showDetails(){
        System.out.println(salary +" is paid to " + employeeId + " by the company " + company);
    }
}


class Hai{
    int x;
    int y;

    public Hai(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void show(){
        System.out.println(this.x + "  " + this.y);
    }
}

public class Hello{
    public static void main(String[] args){
        Emp rahul = new Emp();
        Emp ravi = new Emp();

        Emp.company = "TCS";        // Ststic Declaration

        rahul.employeeId = 10;
        rahul.salary = 3000;

        ravi.salary = 5000;
        ravi.employeeId = 7;

        Emp.company = "CTS";    // Changing the company name

        rahul.showDetails();

        ravi.showDetails();
    }
}
