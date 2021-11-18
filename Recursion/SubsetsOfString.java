package com.Recursion;

import java.util.ArrayList;

public class SubsetsOfString {
    public static void main(String[] args) {
        String str = "abc";
        subset("",str);
       /* System.out.println(str.substring(1));*/

        System.out.println(subsequence("","abs"));
    }
    static void subset(String p, String original){
        if(original.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = original.charAt(0);
        subset(p+ch,original.substring(1));
        subset(p,original.substring(1));
    }

    static ArrayList<String> subsequence(String p , String original){
        if(original.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = original.charAt(0);
        ArrayList<String> left = subsequence(p+ch,original.substring(1));
        ArrayList<String> right = subsequence(p,original.substring(1));

        left.addAll(right);
        return left;
    }
}
