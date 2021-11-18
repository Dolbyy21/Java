package com.JavaBasics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args){

        Set<Integer> values = new HashSet<>();  // No specific order

        System.out.println(values.add(5));
        System.out.println(values.add(9));
        System.out.println(values.add(10));
        System.out.println(values.add(5));  // Trying to add duplicate elements
        System.out.println(values.add(6));

        for(int i : values){
            System.out.println(i);
        }

        Set<Integer> val = new TreeSet<>();
        // 10 -> 53 -> 62 -> 92 (In our case elements are stored in the treeSet in this specific order)

        System.out.println(val.add(53));
        System.out.println(val.add(92));
        System.out.println(val.add(10));
        System.out.println(val.add(10));  // Trying to add duplicate elements
        System.out.println(val.add(62));

        for(Integer i : val ){
            System.out.println(i);
        }

    }
}
