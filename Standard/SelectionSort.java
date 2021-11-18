package com.Standard;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        // 1.Placing the minimum element at it's correct Index
        // 2.Shifting the minimum element to next minimum element
        // 3. Repeat STEP - 1

        int[] numbers = {4,2,8,5,7,1,0,-2,-5};
        System.out.print("Before Sorting  : ");
        System.out.println(Arrays.toString(numbers));
        for(int i = 0; i < numbers.length-1; i++) {
            int index = i;
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[j] < numbers[index])     index = j;
            }
            int smallIndex = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = smallIndex;
        }
        System.out.println("After Sorting  : ");
        System.out.println(Arrays.toString(numbers));
    }
}
