package com.satya;

/**
 * Created by Satya on 10/28/18.
 */
public class CoinsChangeProblem {

    public static void main(String args[]){

        int[] coins=new int[]{1,2,4};

        System.out.println("Count no of ways:"+makeChange(coins,4));


    }

    public static long makeChange(int[] coins,int money){

        return makeChangeCount(coins,money,0);
    }

    public static long makeChangeCount(int[] coins,int money,int index){

        if(money == 0)
            return 1;
        if(index >= coins.length)
            return 0;

        int amountWithCoin=0;
        int ways= 0;
        while(amountWithCoin <= money){
            int remaining=money-amountWithCoin;
            ways += makeChangeCount(coins,remaining,index+1);
            amountWithCoin += coins[index];
        }
        return ways;
    }
}
