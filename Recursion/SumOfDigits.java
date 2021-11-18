package com.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 435;
        int ans = method(n);
        System.out.println(ans);
    }
    private static int method(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + method(n/10);
    }
}
