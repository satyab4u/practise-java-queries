package com.satya.list;

/**
 * Created by Satya on 11/2/18.
 */
public class QuickSort {

    public static void main(String args[]){

        int[] nums=new int[]{15,3,9,8,5,2,7,1,6};
        quickSort(nums,0,nums.length-1);
        printArray(nums);
    }

    public static void printArray(int[] array){
        for(int value: array) {
            System.out.print(value+" ");
        }
        System.out.print("\n");
    }


    public static void quickSort(int[] array,int left,int right) {
        if(left >= right)
            return;

        int pivot= array[(left+right)/2];
        int index= partition(array,left,right,pivot);
        quickSort(array,left,index-1);
        quickSort(array,index,right);

    }

    public static int partition(int[] array, int left, int right, int pivot) {
        while(left <= right){

            while(array[left] < pivot){
                left++;

            }
            while(array[right] > pivot){
                right--;
            }
            if(left <= right){
                swap(array,left,right);
                left++;
                right--;
            }

        }
        return left;
    }

    public static void swap(int[] array,int left,int right) {
        int temp= array[left];
        array[left]=array[right];
        array[right]=temp;
    }
}
