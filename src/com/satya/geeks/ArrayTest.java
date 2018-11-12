package com.satya.geeks;

/**
 * Created by Satya on 11/5/18.
 */
public class ArrayTest {

    public static void main(String args[]){

        int[] nums=new int[]{1,3,5,2,4,9,8};
        int count= minSwaps(nums);
        System.out.println("count::"+count);
    }

    public static int minSwaps(int[] array){

        int count=0;

        for (int i=0;i< array.length-1;i++) {

            for(int j= i+1;j< array.length;j++) {

                if(array[i] > array[j]) {
                    swap(array,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void swap(int[] array,int i, int j){
        int temp= array[i];
        array[i]= array[j];
        array[j]= temp;
    }
}
