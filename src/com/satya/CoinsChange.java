package com.satya;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        Map<String,Long> coinsMap=new HashMap<>();
        long ways= makeChange(coins,money,0, (HashMap<String, Long>) coinsMap);
        for (Map.Entry<String, Long> mapEntry:coinsMap.entrySet()) {
            System.out.println("key:"+mapEntry.getKey()+" value: "+mapEntry.getValue());
        }
        return ways;
    }

    public static long makeChange(int[] coins, int money, int index, HashMap<String,Long> memo){
        if(money == 0)
            return 1;
        if(index >= coins.length)
            return 0;
        int amountOfCoin=0;
        String key= money+"-"+index;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        long ways=0;
        while(amountOfCoin <= money) {
            int remaining=money-amountOfCoin;
            ways+=makeChange(coins,remaining,index + 1,memo);
            amountOfCoin+= coins[index];
        }
        memo.put(key,ways);
        return ways;
    }
}
