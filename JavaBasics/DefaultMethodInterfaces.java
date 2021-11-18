package com.JavaBasics;

@FunctionalInterface
interface X{
    void show();                // Functional Interfaces can allow only one abstract method and many default methods

    default void show1(){       // We can override this default method
        System.out.println("Default Method");
    }
}

class DemoImp implements X{
    public void show(){
        System.out.println("in a show");
    }
}

public class DefaultMethodInterfaces {
    public static void main(String[] args){
        X k = new DemoImp();
        k.show1();
        k.show();
    }
}

