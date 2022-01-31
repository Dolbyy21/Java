package com.company;
// A1 x = new B1(), new A1(), new C1() - Run-Time Polymorphism
// Polymorphism - Many Forms
class A1{
    void so(){
        System.out.println("in A1");
    }
}

class B1 extends A1{
    void so(){
        System.out.println("in B1");
    }
}

class C1 extends B1{
    void so(){
        System.out.println("in C1");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        int a;
        a = 10;
        A1 c1 = new A1(); // A1-Obj
        A1 b1 = new B1(); // B1-obj
        A1 a1;
        a1 = new A1();
        a1.so();
        a1 = new B1();
        a1.so();
        a1 = new C1();
        a1.so();
    }
}
