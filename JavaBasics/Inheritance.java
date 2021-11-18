package com.JavaBasics;

class A{
    public A(){
        System.out.println("in A");
    }

    public A(int i ){
        System.out.println("in int A");
    }
}

class B extends A{
    public B(){
        
        System.out.println("in B");
    }
    public B(int i){
        super(4);
        System.out.println("in int B");
    }

}

class C extends B{
    public C(){
        super();
        System.out.println("in C");
    }

    public C(int i){
        System.out.println("in int C");
    }

    public void show(){
        System.out.println("Showing C");
    } 
}



public class Inheritance {
    public static void main(String[] args){
        C obj = new C();
        obj.show();
        

    }
}
