package com.JavaBasics;

final class AA{              // Final class is created to avoid other classes that are trying to inherit
    final double PI  = 3.14;
    public AA(){
       // DAY = 10;
    } 
}

class BB // extends AA
{
    final int DAY;          // Uisng final to a variable
    
    public BB(){
        DAY = 10;
    //    DAY = 23;
    }
}

// WE CAN USE FINAL KEYWORD EVEN FOR METHODS TO AVOID OVERRIDING 

public class Final {
    public static void main(String[] args){
        AA obj = new AA();
        BB obw = new BB();
        System.out.println(obj.PI);
        System.out.println(obw.DAY);
    }
    
}
