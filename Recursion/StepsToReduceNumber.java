package com.Recursion;

public class StepsToReduceNumber {
    public static void main(String[] args){
        int number = 8;
        int steps = 0;
        int answer = stepsToReduce(number, steps);
        System.out.println(answer);
    }

    static int stepsToReduce(int num, int step){
        if( num == 1){
            return ++step;
        }
        num = num%2 == 0 ? num/2 : num-1;
        return stepsToReduce(num, step+1);
    }
}
