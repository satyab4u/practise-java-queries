package com.satya.geeks;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by Satya on 11/7/18.
 */
public class RansomNote {

    public static void main(String args[]){

        String[] magazine=new String[]{"give","me","one","grand","today","night"};
        String[] note=new String[]{"give","one","grand","today"};

        checkMagazine(magazine,note);

    }

    public static void checkMagazine(String[] magazine,String[] note){
        int[] visited=new int[note.length];

        boolean flag=true;

        for(String noteVal: note){

            if(findWordMatchIndex(magazine,noteVal,visited))
            {
                System.out.println("No");
                flag=false;
                break;
            }
            else {
                System.out.println("Yes");
            }
        }
        System.out.println("Match found::"+flag);

    }

    public static boolean findWordMatchIndex(String[] magazine,String note,int[] visited){

        for(int i=0;i< magazine.length;i++) {
            if(note.equals(magazine[i])){
                return true;

               /*boolean alreadyVisited=false;
                for(int visitedVal: visited) {
                    if(visitedVal == i){
                        alreadyVisited=true;
                        break;
                    }
                }
                if(!alreadyVisited){
                    int index=visited.length+1;
                    visited[index]=i;
                    return true;
                }*/
            }

        }
        return false;

    }

}
