package com.JavaBasics;

//  import javax.swing.plaf.TableHeaderUI;



public class MultithreadingLambdaExpression {
    public static void main(String[] args){
        Runnable obj1 = new Runnable() {public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }};

        Runnable obj2 = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        t2.start();

        // We can also simplify this code by writing anonymous class
        //  Thread t1 = new Thread(() -> for (int i = 0; i < 5; i++) {
        //                System.out.println("Hi");
        //                try {
        //                    Thread.sleep(1000);
        //                } catch (Exception e) {
        //                }
        //            });
        //
        //
        //  Thread t2 = new Thread(() -> for (int i = 0; i < 5; i++) {
        //                System.out.println("Hello");
        //                try {
        //                    Thread.sleep(1000);
        //                } catch (Exception e) {
        //                }
        //            });
        //   No need to create multiple objects and multiple classes
    }
}
