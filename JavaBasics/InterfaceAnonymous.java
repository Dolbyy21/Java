package com.JavaBasics;

interface V{
    void show();
}

// class Implementer implements V{
//     public void show(){
//         System.out.println("in a show");
//     }
// }

public class InterfaceAnonymous {
    public static void main(String[] args){
        V on = new V(){
            public void show() {
                System.out.println("i'm the best");
            }
        };
    }
}
