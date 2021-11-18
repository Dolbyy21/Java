package com.JavaBasics;

import java.util.HashMap;

public class HMap {
    public static void main(String[] args){
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i = 0; i < 10; i++){
            hm.put(i,"Hey"+i);
        }
        for(int i = 0; i < hm.size(); i++) {
            System.out.println(hm.get(i));
        }
    }
}
