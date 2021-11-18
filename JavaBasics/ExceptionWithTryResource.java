package com.JavaBasics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionWithTryResource {
    public static void main(String[] args) throws Exception{
        int n = 0;
        System.out.println("enter a number ");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {    // Try with Resource
            n = Integer.parseInt(br.readLine());
        }
    }
}
