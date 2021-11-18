package com.JavaBasics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedException {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int n = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            n = Integer.parseInt(br.readLine());
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Catch Exception");
        }


        System.out.println(n);


    }
}
