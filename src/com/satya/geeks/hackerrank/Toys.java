package com.satya.geeks.hackerrank;

import java.util.Arrays;

/**
 * Created by Satya on 11/8/18.
 */
public class Toys {

    public static void main(String args[]) {
        int nums[]=new int[]{1,2,3,4};
        int money=7;
        System.out.println(maximumToys(nums,money));
    }

    public static int maximumToys(int[] array,int money) {

     int count=0;
     int amount=0;

     Arrays.sort(array);

     for(int i=0;i<array.length;i++){

         amount+=array[i];

         if(amount <= money) {
             count++;

         }
         else {
             break;
         }

     }


     return count;
    }
}
