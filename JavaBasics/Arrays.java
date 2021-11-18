package com.JavaBasics;

public class Arrays {
    public static void main(String[] args){
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++){
            arr[i] = i*10;
        }

        for(int i : arr){
            System.out.print(" "+i);
        }

        // 2D Arrays
        System.out.println();
        System.out.println(" Let's have a look at 2D Array");
        int[][] arr2D = new int[2][3];
        for(int i = 0; i < 2;i++){
            for (int j = 0; j<3; j++){
                arr2D[i][j] = (i*2)+2+(j*3);
            }
        }

        for(int i[] : arr2D){
            for(int j : i){
                System.out.print(" "+j);
            }
            System.out.println();
        }

        // Jagged 2D-Arrays

        System.out.println();
        System.out.println("Let's have a look at 2D-Jagged Arrays");

        int [][] jaggedArray = {
                                {12,323,434},
                                {321,5,6,4,5,3},
                                {1}
                                };
        
        for(int i[] : jaggedArray){
            for(int j : i){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
