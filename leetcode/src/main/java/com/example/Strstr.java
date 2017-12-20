package com.example;

/**
 * Created by dengjx on 2017/12/20.
 */

public class Strstr {
    public int strStr(String haystack, String needle){
        int returnnum = -1;
        if(!haystack.equals("")){
            if(!needle.equals("")){
            if((haystack.indexOf(needle)) != -1){
                returnnum = haystack.indexOf(needle);
            }
            }else {
                returnnum = 0;
            }
        }else {
            if(needle.equals("")){
                returnnum = 0;
            }
        }
        System.out.println("returnnum:" + returnnum);
        return  returnnum;
    }

    public static void main (String[] args){
        Strstr strstr = new Strstr();
        strstr.strStr("a", "a");
    }
}
