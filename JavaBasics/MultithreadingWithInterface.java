package com.JavaBasics;

class Onee implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("One");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Twoo implements Runnable{
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

public class MultithreadingWithInterface {
    public static void main(String[] args){
        Runnable one = new Onee();
        Runnable two = new Twoo();

        Thread t1 = new Thread(one);
        Thread t2 = new Thread(two);

        t1.start();

        try {
            Thread.sleep(20);
        } catch (Exception e) {
        }

        t2.start();

    }
}
