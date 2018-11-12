package com.satya.search;

/**
 * Created by Satya on 11/1/18.
 */
public class MergeSort {

    public static void mergeHalves(int[] array, int left, int middle,int right) {

        int n1= middle-left+1;
        int n2= right-middle;

        int L[]=new int[n1];
        int R[]=new int[n2];

        for(int i=0;i<n1;i++) {
            L[i]=array[left+i];
        }

        for(int j=0; j<n2; j++) {
            R[j]= array[middle+1+j];
        }

        int i = 0,j= 0;
        
        int k=left;

        while(i < n1 && j<n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while(j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }

    }


    public static void sort(int[] array, int left, int right){

        if(left < right) {

            int middle = left + (right - left) / 2;

            sort(array, left, middle);
            sort(array, middle + 1, right);
            mergeHalves(array, left, middle, right);
        }
    }

    public static void printArray(int[] array){
        for (int val: array) {
            System.out.print(val+" ");
        }
        System.out.print("\n");
    }

    public static void main(String args[]) {
        int nums[]=new int[]{1,3,2,6,4,13,9,5,7,12};
        printArray(nums);
        sort(nums,0,nums.length-1);
        printArray(nums);
       // mergeSort()
    }
}

