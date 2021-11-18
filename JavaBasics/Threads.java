package com.JavaBasics;

import java.lang.*;
import java.util.*;

class One extends Thread{
    public void run() {
        for(int i = 0;i < 5;i++){
            System.out.println("One");
            try{
            Thread.sleep(1000);}
            catch(Exception e) {}
        }
    }
}


class Two extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Two");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}


public class Threads {
    public static void main(String[] args) {

        One one = new One();
        Two two = new Two();

        one.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        two.start();
    }
}
