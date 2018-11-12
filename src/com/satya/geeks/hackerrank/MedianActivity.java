package com.satya.geeks.hackerrank;

import java.util.Arrays;

/**
 * Created by Satya on 11/8/18.
 */
public class MedianActivity {

    public static void main(String args[]) {

        int nums[]=new int[]{2,3,4,2,3,6,8,4,5};
        int days=5;
    //    System.out.println(calculateMedian(nums,5));
        System.out.println(activityNotifications(nums,days));

    }

    public static int activityNotifications(int[] array,int days){
        int count=0;
        for(int i= days;i<array.length;i++){
            double median=calculateMedian(array,days);
            if(array[i] >= 2*median){
                count++;
            }
        }
       return count;
    }

    public static double calculateMedian(int[] array,int days) {
        Arrays.sort(array);
        if(days %2 != 0){
            return array[days/2];
        }
        else{
            return (array[(days-1/2)]+array[days/2])/2;
        }
    }

}
