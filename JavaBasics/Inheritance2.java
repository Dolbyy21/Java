package com.company;
//  Inheritance
class K{
    void something(int a){
        System.out.println("In K "+ a);
    }
}
class B extends K{
    void something(String name){
        System.out.println("In B "+ name);
    }
}
class C extends B {
    void something(){
        System.out.println("In C");
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
       // B b = new B();
        C c = new C();
        c.something(1); // something(singleParam)
    }
}
