package com.Recursion;

import java.util.ArrayList;
import java.util.List;
/*

    Complexity
    O (2^n * n)  --->   (time and space)

*/
public class SubsetsOfArray {
    public static void main(String[] args) {
        List<List<Integer>> outer = subset(new int[]{1,2,3});
        /*for(List<Integer> lst : outer){
            System.out.println(lst);
        }*/
        System.out.println(outer);
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }





































































































































































        return outer;
    }

}
