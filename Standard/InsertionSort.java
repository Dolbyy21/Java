package com.Standard;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 5, 7, 1, 0, -2, -5};
        System.out.print("Before Sorting  : ");
        System.out.println(Arrays.toString(numbers));
        int n = numbers.length;
        for(int i = 1; i < n; i++){
            int key = numbers[i];
            int minIndex = i-1;
            while(minIndex > -1 && numbers[minIndex] > key){
                numbers[minIndex+1] = numbers[minIndex];
                minIndex--;
            }
            numbers[minIndex+1] = key;
        }
        System.out.println("After Sorting  : ");
        System.out.println(Arrays.toString(numbers));
    }
}
