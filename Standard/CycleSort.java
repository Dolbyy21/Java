package com.Standard;
import java.util.Arrays;
public class CycleSort {
    //  Applicable to (1-N) (0-N) continuous range integers
    public static void main(String[] args) {
        int[] numbers = {7,4,5,3,1,2,8,9,6};
        int n = numbers.length;
        System.out.print("Before Sorting  : ");
        System.out.println(Arrays.toString(numbers));
        int i = 0;
        while(i < numbers.length){
            int correctIndex = numbers[i]-1;
            if(numbers[correctIndex] != numbers[i]){
                int temp = numbers[correctIndex];
                numbers[correctIndex] = numbers[i];
                numbers[i] = temp;
            }else{
                i++;
            }
        }
        System.out.println("After Sorting  : ");
        System.out.println(Arrays.toString(numbers));
    }
}
