package com.Recursion;

public class SortedArray {
    public static void main(String[] args){
        int[] array = {1,2,4,6,77,8,121,151};
        int start = 0;
        boolean ans = isSorted(array,start);
        String answer = ans ? "Sorted" : "Not Sorted";
        System.out.println(answer);
    }

    private static boolean isSorted(int[] array, int start) {

        if(start == array.length-1)
            return true;
        int posValue = array[start];
        int posNextValue = array[start+1];
        
        return (posNextValue > posValue) && isSorted(array,++start);
    }
}
