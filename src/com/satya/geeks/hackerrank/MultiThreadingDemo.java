package com.satya.geeks.hackerrank;

/**
 * Created by Satya on 11/11/18.
 */
public class MultiThreadingDemo extends Thread {

    public void run() {
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        }
        catch (Exception exception) {
            System.out.println("Exception is caught");
        }
    }

    public static void main(String args[]) {

        for(int i=0; i<8; i++) {

            MultiThreadingDemo demo= new MultiThreadingDemo();
            demo.start();

        }

    }
}
