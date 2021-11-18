package com.Standard;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 5, 7, 1, 0, -2, -5};
        int target = 10;
        int start = 0;
        int end = numbers.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            int value = numbers[mid];
            if(target == value){
                System.out.println("Found at : "+ mid);
                return;
            }
            if(target < mid)    end = mid-1;
            else                start = mid+1;
        }
        System.out.println("Not Found "+ -1);
    }
}
