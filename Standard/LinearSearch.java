package com.Standard;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 5, 7, 1, 0, -2, -5};
        int target = 7;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                System.out.println("Found at : "+ i);
                return;
            }
        }
        System.out.println("Not Found ");
    }

}
