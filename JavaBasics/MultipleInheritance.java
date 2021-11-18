package com.JavaBasics;

interface Demo{

    void abc();

    default void show(){
        System.out.println("In Demo");
    }
}

interface MyDemo{
    default void show(){
        System.out.println("In MyDemo");
    }
}

class SomeClass implements Demo,MyDemo{
    public void abc(){
        System.out.println("abc Defined");
    }

    @Override
    public void show() {
        MyDemo.super.show();
    }

}


public class MultipleInheritance {
    public static void main(String[] args){
            Demo obj = new SomeClass();
            obj.show();

    }
}
