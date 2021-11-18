package com.JavaBasics;

class AAA{
    public void show(){
        System.out.println("in show");
    }
}


class BBB extends AAA{
   /* @Override
    public void show(){
        System.out.println(
                "I'm the  best"
        );
    }*/

}


public class Anonymous{
    public static void main(String[] args){
        AAA o = new BBB(){
                          public void show(){
                              System.out.println("i'm the best");
                          }
                        };
        o.show();
    }
}