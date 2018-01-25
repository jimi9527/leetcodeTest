package com.example;

/**
 * 给定一个字符串，求第一个不重复的字符 abbcad -> c
 * Created by dengjx on 2018/1/25.
 */

public class FindTheFirstNum {
    public String find(String c){
        String str = "";
        char[] strArray = c.toCharArray();
        if(strArray.length > 1){
            for(int i = 0; i < strArray.length; i++){
                boolean isFlag = false;
                for(int j = 0; j < strArray.length; j++){
                    if( i != j){
                    if(strArray[i] == strArray[j]){
                        isFlag = true ;
                        break;
                    }
                    }
                }

                if(!isFlag){
                    str  = String.valueOf(strArray[i]);
                    break;
                }

            }
        }else {
            str = c;
        }
        System.out.print("str:"+str);
        return str;
    }

    public static void main(String[] args){
        FindTheFirstNum findTheFirstNum = new FindTheFirstNum();
        findTheFirstNum.find("abbcad");
    }
}
