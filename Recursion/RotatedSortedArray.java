package com.Recursion;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] rtArray = {5,6,7,8,9,1,2,3};
        int start = 0;
        int end = rtArray.length-1;
        int target = 29;
        int found = isFoundBS(rtArray, start, end, target);
        System.out.println("Found at "+found);
    }

    private static int isFoundBS(int[] Array, int start, int end, int target) {

        if(start > end) return -1;

        int mid = start + (end-start)/2;

        if(Array[mid] == target)   return mid;

        if(Array[start] <= Array[mid]){
            if(target >= Array[start] && target <= Array[mid]){
                return isFoundBS(Array, start, mid-1,target);
            }else{
                return isFoundBS(Array,mid+1,end,target);
            }
        }
        if(target >= Array[mid] && target <= Array[start]){
            return isFoundBS(Array,mid+1,end,target);
        }
        return isFoundBS(Array,start,mid-1,target);
    }

}
