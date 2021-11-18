package com.JavaBasics;

import java.util.*;
import java.util.Set.*;


public class CollectionAPIInterface {
    public static void main(String[] args){

        Collection<Integer> values = new ArrayList<>();

        values.add(2);
        values.add(3);
        values.add(34);
        values.add(22);

        Iterator it = values.iterator();    // Iterator object to iterate over the array
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Set<Integer> s = new HashSet<>();

        s.add(2);
        s.add(43);
        s.add(49);
        s.add(41);
        s.add(55);
        s.add(23);

        System.out.println(s);

        System.out.println(values);
    }
}
