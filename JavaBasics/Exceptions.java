package com.JavaBasics;
// All the types of Exceptions are subclasses of the CLASS "Exception"


public class Exceptions {
    public static void main(String[] args){
        try {

            int i = 4/0;

            int[] a = new int[2];
            a[2] = 7;
        }

        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero "+ e);
        }


        catch(Exception e){
            System.out.println("Exception is "+e);
        }
        finally {
            System.out.println("Finished");
        }
    }
}

