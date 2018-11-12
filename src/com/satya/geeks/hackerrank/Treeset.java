package com.satya.geeks.hackerrank;

import java.util.TreeSet;

/**
 * Created by Satya on 11/11/18.
 */
public class Treeset {
    public static void main(String[] args)
    {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Geeks");
        treeSet.add("for");
        treeSet.add("Geeks");
        treeSet.add("GeeksforGeeks");

        for (String temp : treeSet)
            System.out.printf(temp + " ");

        System.out.println("\n");
    }
}
