package com.satya;

/**
 * Created by Satya on 10/25/18.
 */
public class RotateForMaxSum {

    public static void main(String args[]){

        int arr[]=new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("MAX SUM value:::"+sum(arr,arr.length));

    }

    static int sum(int arr[],int size){

        int sum=calculateSum(arr,size);

        for(int i=0;i<size-1;i++){
            rotateArrayByOne(arr,size);
            int tempSum=calculateSum(arr,size);
            if(sum < tempSum)
                sum=tempSum;
        }
        return sum;
    }

    static int calculateSum(int arr[],int size){
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+i*arr[i];
        }
        return sum;
    }

    static void rotateArrayByOne(int arr[],int size){
        int i,temp;
        temp=arr[0];
        for(i=0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
    }

}
