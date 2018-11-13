package com.satya.search;

/**
 * Created by Satya on 11/12/18.
 */
public class Fibonacci {
    public static void main(String args[]) {
        int number =2;
        System.out.println("fibonacci value of "+number+" ::"+fib(number));
        //f(3) 2
        //f(4) 3
        //f(2) 1

    }

    public static int fib(int n) {
        if(n <= 0) {
            return 0;
        }
        else if(n == 1) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

}
