package com.Recursion;

import java.util.ArrayList;

public class LinearSearch{
    public static void main(String[] args){
        int[] array = {1,43,5,7,9,7,7,78,23};
        int target = 7;
        /*int ans = isFound(array,target,0);
        String printable = ans != -1 ? "Found at "+ ans : "Not found";
        System.out.println(printable);*/
        ArrayList<Integer> ansList = isFoundDuplicateArray(array,target,0);
        String printableList = ansList.size() != 0  ? "Found at "+ ansList : "Not found";
        System.out.println(printableList);
    }

    private static ArrayList<Integer> isFoundDuplicateArray(int[] array, int target, int start) {
        if(start == array.length){
            return list;
        }
        if(array[start] == target)  list.add(start);

        return isFoundDuplicateArray(array, target, ++start);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    private static int isFound(int[] array, int target, int start) {
        if(start == array.length){
            return -1;
        }
        if(array[start] == target)  return start;

        return isFound(array,target,++start);
    }


}