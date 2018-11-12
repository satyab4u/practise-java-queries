package com.satya.geeks.hackerrank;

import java.util.Arrays;

/**
 * Created by Satya on 11/10/18.
 */
public class IceCreamParlor {

    public static void main(String args[]) {
        int[] menu= {1,4,5,3,2};
        int money=4;
        int[] indices=findChoices(menu,money);
        System.out.println("Index1:"+(indices[0]+1)+" index2:"+(indices[1]+1));
    }

    public static int indexOf(int[] menu,int value,int excludethis) {
        for(int i=0;i<menu.length;i++) {
            if(menu[i] == value && i != excludethis){
                return i;
            }
        }
        return -1;
    }

    public static int[] getIndices(int[] menu,int value1,int value2) {
        int index1=indexOf(menu,value1,-1);
        int index2=indexOf(menu,value2,index1);
        return new int[]{index1,index2};

    }

    public static int[] findChoices(int[] menu,int money) {
        int[] sortedMenu=menu.clone();
        Arrays.sort(sortedMenu);

        for(int i=0;i< sortedMenu.length;i++) {
            int complement= money - sortedMenu[i];
            int location= Arrays.binarySearch(sortedMenu,i+1,sortedMenu.length,complement);
            if(location > 0 && location < sortedMenu.length && sortedMenu[location] == complement ){
                int[] indices= getIndices(menu,sortedMenu[i],complement);
                return indices;
            }
        }
        return null;
    }
}
