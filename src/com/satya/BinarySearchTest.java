package com.satya;

/**
 * Created by Satya on 10/26/18.
 */
public class BinarySearchTest {

    public static void main(String args[]){

        int arr[]={1,2,3,2,1};
        System.out.println(peakAtMountain(arr));


    }

    static int peakAtMountain(int arr[]){
        int left=0;
        int right=arr.length;

        while(left<right){
            int mid= left+(right-left)/2;

            if(arr[mid]< arr[mid+1]){
                left=mid+1;
            }
            else
                right=mid-1;
        }
       // return arr[];
       // return arr[];
       // return arr[];
        return 0;
    }

}
