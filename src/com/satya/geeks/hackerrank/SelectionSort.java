package com.satya.geeks.hackerrank;

/**
 * Created by Satya on 11/11/18.
 */
public class SelectionSort {
    public static void main(String args[]) {
        int[] nums={8,6,9,3,2,7};
        selectionSort(nums,nums.length);
        printArray(nums);

    }

    public static void printArray(int[] array) {
        for (int val: array) {
            System.out.print(val+"  ");
        }
    }

    public static void selectionSort(int[] array,int size) {
        for(int i=0; i<size-1; i++) {
            //find the smallest element
            int iMin=i;

            for(int j=i+1; j<size; j++) {
                if(array[iMin] > array[j]) {
                    iMin= j;
                }
            }
            if(iMin != i ){
                int temp= array[i];
                array[i]= array[iMin];
                array[iMin]=temp;
            }
        }
    }
}
