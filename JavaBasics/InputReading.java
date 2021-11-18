package com.JavaBasics;

import java.util.Scanner;

public class InputReading {
    public static void main(String[] args){
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        System.out.println("Entered number is "+i);
    }
}
