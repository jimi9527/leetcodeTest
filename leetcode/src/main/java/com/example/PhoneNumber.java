package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dengjx on 2017/12/20.
 */

public class PhoneNumber {
    public List<String> letterCombinations(String digits){
        String [][] strArray = new String[][]{{},{},{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"}
                ,{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
        List<String> listStr = new ArrayList<>();

        return listStr;
    }




    public static void main(String[] args){
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.letterCombinations("234");
    }
}
