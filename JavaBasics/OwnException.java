package com.JavaBasics;

public class OwnException {
    public static void main(String[] args){
        int i,j;
        i = 8;
        j = 9;

        try{
            int k = i/j;

            if(k==0){
                throw new DolbyException("This is not Possible");
            }
            System.out.println(k);
        }
        catch(Exception e){
            System.out.println("Excveptg " +e.getMessage());
        }
        System.out.println(8/9);
    }

}