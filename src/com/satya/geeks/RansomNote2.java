package com.satya.geeks;

/**
 * Created by Satya on 11/7/18.
 */
public class RansomNote2 {

    public static void main(String args[]){

         String[] magazine=new String[]
         {"give","me","one","grand","today","night"};

        String[] note=new String[]{"give","one","grand","today1"};

        checkMagazine(magazine,note);

    }

    public static void checkMagazine(String[] magazine,String[] note){

        boolean found=false;

        for (String word: note){
            if(findMatchForWord(magazine,word))
            {
               found=true;
            }
            else{
                found=false;
                break;
            }
        }
        if(found){
            System.out.println("Matched......");
        }
        else{
            System.out.println("Not matched.....");
        }

    }

    public static boolean findMatchForWord(String[] magazine,String word){

        boolean flag=false;

        for(String value: magazine){
            if(value.equals(word)){
                return true;
            }
        }
        return flag;

    }

}
