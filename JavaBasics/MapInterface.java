package com.JavaBasics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface
{
    public static void main(String[] args)
    {

        Map<String,Integer> map = new HashMap<>(); // Not synchronised
        map.put("Dolby",99);
        map.put("Doodle",89);
        map.put("Prakash",90);

        Set<String> keys = map.keySet();

        for(String key : keys) {
            System.out.println(key + " " +map.get(key));
        }

        Map<String,Integer> ma1 = new Hashtable<>();    // Synchronized
    }
}
