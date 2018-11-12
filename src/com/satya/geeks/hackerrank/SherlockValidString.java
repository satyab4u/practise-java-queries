package com.satya.geeks.hackerrank;

import java.util.*;

/**
 * Created by Satya on 11/9/18.
 */
public class SherlockValidString {
    public static void main(String args[]) {
        String word="abcdefghhgfedecba";
        System.out.println("isValid::"+isValid(word));

    }

    public static String isValid(String word) {

        Map<Character,Integer> wordMap=new HashMap<>();
        String result=null;

        for(Character character:word.toCharArray()){
            if(wordMap.containsKey(character)){
                wordMap.put(character,wordMap.get(character)+1);
            }
            else{
                wordMap.put(character,1);
            }
        }
        Set<Integer> frequencies=new HashSet<>();
        for (Integer value:wordMap.values()) {
             frequencies.add(value);
        }

        int freqSize=frequencies.size();

        if(freqSize == 1){
            result= "YES";
        }
        else if(freqSize >2) {
            result= "NO";
        }
        else{
            List<Integer> freqList=new ArrayList<>(frequencies);
            int f1=freqList.get(0);
            int f2=freqList.get(1);
            int f1Count=0,f2Count=0;

            for (Integer value: wordMap.values()){
                if(value == f1){
                    f1Count++;
                }
                else{
                    f2Count++;
                }

            }

            if((f1 == 1 && f1Count == 1) || (f2 == 1 && f2Count==1 ))
                result="YES";
            else if(Math.abs(f1-f2) == 1 && (f1Count ==1 || f2Count == 1) ) {
                result="YES";
            }
            else{
                result="NO";
            }

        }
     return result;
    }
}
