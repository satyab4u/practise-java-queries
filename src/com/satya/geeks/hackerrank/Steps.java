package com.satya.geeks.hackerrank;

/**
 * Created by Satya on 11/10/18.
 */
public class Steps {

    public static void main(String args[]) {
        int steps=10;
        System.out.println("paths count:"+countPathsR(steps));
        //961952911
        //-2065138873
        //274
    }
    public static int countPathsR(int steps) {
        if(steps < 0)
            return 0;
        if(steps == 0)
            return 1;
        else
            return countPathsR(steps-1)+countPathsR(steps-2)+countPathsR(steps-3);
    }

    public static int countPathsMemo(int steps){
        return countPathsMemo(steps,new int[steps+1]);
    }

    public static int countPathsMemo(int steps,int[] memo) {
        if(steps <0 )
            return 0;
        if(steps == 0)
            return 1;
        int n= steps;
        if(memo[n] == 0) {
            memo[n] = countPathsMemo(steps-1,memo)+countPathsMemo(steps-2,memo)+countPathsMemo(steps-3,memo);
        }
        return memo[n];
    }

    public static int countPathsDp(int steps) {
        if(steps < 0) {
            return 0;
        }
        if(steps <= 1)
            return 1;
        int[] paths= new int[steps+1];
        paths[0]=1;
        paths[1]=1;
        paths[2]=2;
        for(int i=3;i<=steps;i++) {
            paths[i]= paths[i-1]+paths[i-2]+paths[i-3];
        }
        return paths[steps];
    }
}
