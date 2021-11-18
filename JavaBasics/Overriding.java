package com.JavaBasics;

class A1 {
    public void show() {
        System.out.println("in A");
    }
}

class B1 extends A1 {
    @Override
    public void show() {
        System.out.println("in B");
    }
}

class C1 extends B1{
    @Override
    public void show(){
        System.out.println("in C");
    }
}
// Main class
public class Overriding {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.show();
    }
}
