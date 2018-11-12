package com.satya.geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Satya on 11/7/18.
 */
public class Triplets {

    public static void main(String args[]) {

        List<Long> array=new ArrayList<>();
        array.add(new Long(1));
        array.add(new Long(2));
        array.add(new Long(2));
        array.add(new Long(4));
        long r= 2;

        int count = countTriplets(array,r);
        System.out.println("count::"+count);
    }

    public static int countTriplets(List<Long> array,long r){

        int count=0;
        int n= array.size();

        for(int i=0; i< n-2; i++) {
            System.out.println("i value:"+i);
            for(int j=i+1;j<n-1;j++){
                System.out.println("j value:"+j);
                for(int k=j+1 ;k< n;k++) {
                    System.out.println("k value:"+k);
                    if(array.get(i) * r == array.get(j) && array.get(j) * r == array.get(k)){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
