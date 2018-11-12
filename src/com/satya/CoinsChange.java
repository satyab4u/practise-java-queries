package com.satya;

/**
 * Created by Satya on 10/28/18.
 */
public class CoinsChange {

    public static void main(String args[]){

        System.out.println("Main method started....");
        int coins[]={1,2,3};

        int target= 4;
        System.out.println(makeChange(coins,target));



    }

    public static long makeChange(int[] coins, int money){
        return makeChange(coins,money,0);

    }

    public static long makeChange(int[] coins,int money,int index){

        if(money == 0)
        {
            return 1;
        }
        if(index >= coins.length){
            return 0;
        }
        int amountWithCoins=0;
        long ways=0;

        while (amountWithCoins <= money){
            int remaining = money-amountWithCoins;
            ways += makeChange(coins,remaining,index+1);
            amountWithCoins += coins[index];

        }
        return ways;
    }
}
