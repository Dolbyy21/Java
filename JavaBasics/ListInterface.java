package com.JavaBasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {
    public static void main(String[] args){
        List values = new ArrayList();

        values.add(2);
        values.add(4);
        values.add(6);
        values.add(1,3);
        System.out.println("Iterator object");
        Iterator it = values.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Normal For Loop");
        for(int i  = 0; i < values.size() ; i++){
            System.out.println(values.get(i));
        }
        System.out.println("Enhanced for Loop");
        for( Object n : values){
            System.out.println(n);
        }
    }
}
