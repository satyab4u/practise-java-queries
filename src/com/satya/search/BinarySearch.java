package com.satya.search;

/**
 * Created by Satya on 11/1/18.
 */
public class BinarySearch {
    // recursive approach

    public static int binarySearch(int[] array,int left, int right,int target) {
        if(right >= 1){

            int middle= left + (right-left)/2;

            System.out.println("middle::"+middle);

            if(array[middle] == target) {
                return middle;
            }
            else if(array[middle] < target) {
                return binarySearch(array,middle+1,right,target);
            }
            else {
                return binarySearch(array,left,middle-1,target);
            }

        }
        return -1;
    }

    public static int binarySearchIterative(int[] array,int left, int right, int target) {

        while (left <= right) {
            int middle= left + (right-left)/2;
            System.out.println("middle::"+middle);
            if(array[middle] == target)
                return middle;
            if(array[middle] < target) {
                left = middle+1;
            }
            else{
                right= middle-1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] array={1,5,7,9,11,20};

  //      System.out.println("Binary search recursive:::"+binarySearch(array,0,array.length-1,11));

        System.out.println("Binary search iterative:::"+binarySearchIterative(array,0,array.length-1,11));
    }

}
