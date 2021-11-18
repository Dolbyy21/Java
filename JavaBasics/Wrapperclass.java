package com.JavaBasics;

public class Wrapperclass {
    public static void main(String[] args){
        int i = 3;
        Integer ii = 4;        // Wrapper Class
        System.out.println(ii.intValue());

        int k = ii.intValue();              // To access the value from a wrapper class from wrapper object // UnBoxing - UnWrapping


        Integer iii = i;       // Boxing  - Wrapping

        Integer value = i;                  // AutoBoxing - AutoWrapping

        int l = value;                      // AutoUnBoxing - AutoUnWrapping

        // PARSEINT

        String s = "123";
        String sf = "12.3";

        int parseIntValue = Integer.parseInt(s);
        Double parseDoubleValue = Double.parseDouble(sf);

        System.out.println(parseIntValue);
        System.out.println(parseDoubleValue);


    }
    
}
