package com.satya.geeks.hackerrank;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Satya on 11/10/18.
 */
public class Medians {
    public static void main(String args[]) {
        int[] array= new int[]{1,5,10,12,2,3,8,9};
        double[] medians=getMedians(array);
        for(double d: medians) {
            System.out.print(d +" ");
        }
    }

    public static double[] getMedians(int[] array) {

        PriorityQueue<Integer> lowers=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return -1* a.compareTo(b);
            }
        });

        PriorityQueue<Integer> highers=new PriorityQueue<>();

        double[] medians=new double[array.length];

        for(int i=0;i< array.length;i++) {
            addNumber(lowers,highers,array[i]);
            rebalance(lowers,highers);
            medians[i]=getMedian(lowers,highers);
        }
        return medians;
    }

    public static void addNumber(PriorityQueue<Integer> lowers,PriorityQueue<Integer> highers,int number){
        if(lowers.size() == 0 || number< lowers.peek() ){
            lowers.add(number);
        }
        else {
            highers.add(number);
        }
    }

    public static void rebalance(PriorityQueue<Integer> lowers,PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap=(lowers.size() > highers.size()) ? lowers : highers;
        PriorityQueue<Integer> smallerHeap=(lowers.size() > highers.size()) ? highers : lowers;
        if(biggerHeap.size() - smallerHeap.size() >= 2) {
            smallerHeap.add(biggerHeap.poll());
        }
    }

    public static double getMedian(PriorityQueue<Integer> lowers,PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap=(lowers.size() > highers.size()) ? lowers : highers;
        PriorityQueue<Integer> smallerHeap=(lowers.size() > highers.size()) ? highers : lowers;
        if(smallerHeap.size() == biggerHeap.size()) {
           return (double)(smallerHeap.peek()+biggerHeap.peek())/2;
        }
        else {
            return biggerHeap.peek();
        }
    }
}
