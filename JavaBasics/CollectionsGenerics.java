package com.JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class CollectionsGenerics {
    public static void main(String[] args){

        List<Integer> li = new ArrayList<>();

        li.add(2);
        li.add(5);
      //  try {
        //    li.add("w");
        //}
        //catch(Exception e){
          //  System.err.println("error");
       // }
        li.add(66);

        for(Object o:li){
            System.out.println(o);
        }
    }
}
