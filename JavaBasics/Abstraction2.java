package com.company;
/*
define - > void func(){  }
declare  - > func();
 */

// Project
// abstract class(declare) -> class A(define), class B(define),
// abstract class's Object cannot be created using
abstract class abs{
    abstract void ao();
    abstract void dataPreparation();
    abstract void buildModel();
    abstract void trainModel();
    abstract void testModel();
}
// Class 'CV' must either be declared abstract or implement abstract method 'ao()' in 'abs'
class CV extends abs{
    @Override
    void ao(){
        System.out.println("Implemented ao in ' abs '");
    }
    @Override
    void dataPreparation() {

    }
    @Override
    void buildModel() {

    }
    @Override
    void trainModel() {

    }
    @Override
    void testModel() {

    }
}


public class Abstraction2 {
    public static void main(String[] args) {
       // abs c = new abs(); // 'abs' is abstract; cannot be instantiated
        abs c = new CV();
        c.ao();
        c.dataPreparation();
    }
}
