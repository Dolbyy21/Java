package com.Recursion;

public class ReverseNumber {
    static int sum = 0;
    public static void main(String[] args) {
        int n = 1232;
        reversed(n);
        System.out.println("Reversed Number is : "+sum);
        int ans = reversed2(n);
        System.out.println("Reversed number from method is : "+ ans);
        String pal = isPalindrome(n) ? "Palindrome" : "Not a Palindrome";
        System.out.println(pal);
    }

    static void reversed(int n) {
        if(n == 0)  return;
        int rem = n%10;
        sum = sum * 10 +rem;
        reversed(n/10);
    }

    static int reversed2(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    static int helper(int n, int digits){
        if(n%10 == n)   return n;
        int rem = n%10;
        return rem * (int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }

    static boolean isPalindrome(int n){
        if(n == reversed2(n)){
            return true;
        }return false;
    }
}
