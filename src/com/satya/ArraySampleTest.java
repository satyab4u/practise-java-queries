package com.satya;

import java.util.*;

/**
 * Created by Satya on 10/24/18.
 */
public class ArraySampleTest {

    public static void main(String args[]){

      int[] nums=new int[]{1,2,3,4,5,6,7};
        ArraySampleTest test=new ArraySampleTest();
        /*test.rotateLeft(nums,2,7);
        test.printArray(nums);
*/


    }

    public void rotateLeft(int[] nums, int d, int n){
        for(int i=0;i<d;i++){
            leftRotateByOne(nums,n);
        }
    }

    public void leftRotateByOne(int[] nums,int n){
        int i, temp;
        temp=nums[0];
        for( i=0;i<n-1;i++)
           nums[i]= nums[i+1];
        nums[i]=temp;
    }

    public void printArray(int[] nums){
        for(int val:nums){
            System.out.print(val + " ");
        }
    }


    public void reverseArray(int arr[], int start, int end){
        int temp;
        while(start<end){
             temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end --;
        }
    }





}
