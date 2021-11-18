package com.Standard;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {4,2,8,5,7,1,0,-2,-5};
        System.out.print("Before Sorting  : ");
        System.out.println(Arrays.toString(numbers));
        int n = numbers.length;
        for(int i = 0; i < n-1; i++){
            boolean flag = false;
            for(int j = 0;j<n-1-i; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println("After Sorting  : ");
        System.out.println(Arrays.toString(numbers));
    }
}
