package com.JavaBasics;

@FunctionalInterface
interface Demoo{

    int a = 10;             // This variable is a constant Final We cannot re-define it later at any place

    void abc();
    default void show(){
        System.out.println("In a Show");
    }

    static void Doing(){                            // We can have static methods in an Interface
        System.out.println("Im gonna do it");
    }

    static void come(){
        System.out.println("Another static method");
    }


}

class GG implements Demoo{
    public void abc(){
        //a = 2;   // We cannot define a here as it became a final variable when it is declared in an interface
        System.out.println("GG-Demoo");
    }
}


public class StaticMethodInInterface {
    public static void main(String[] args){
        Demoo.Doing();
        Demoo.come();
    }
}
