package com.JavaBasics;// Types of interfaces
// 1. Normal
// 2. Single abstract method - Functional Interface - Lambda Expression - Scala
// 3. Marker Interfaces

@FunctionalInterface
interface Abc
{
    void show();
  //  void show1();         Cannot use two methods in Functional Interface
}

public class TypesOfInterfaces {
    public static void main(String[] args){
        Abc k = ()->System.out.println("hey");  // Lambda Expression
        k.show();
    }
}
