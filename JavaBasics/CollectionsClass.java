package com.JavaBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args){
        List<Integer> li = new ArrayList<>();

        li.add(404);
        li.add(205);
        li.add(801);
        li.add(102);
        Collections.reverse(li);

        //  Sorting based on the digit in the one's place

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(li,c);

        for(Integer o : li){
            System.out.println(o);
        }
    }
}
