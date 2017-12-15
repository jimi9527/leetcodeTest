package com.example;

/**
 * Created by dengjx on 2017/12/15.
 */

public class RomanInteger {
    public String intToRoman(int num){
        StringBuilder stringBuilder = new StringBuilder();
        String[][] charRoman = new String[][]{
            {"","I","II","III","IV","V","VI","VII","VIII","IX"},
            {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
            {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
            {"","M","MM","MMM"}};
        if(num > 0 && num < 10){
            stringBuilder.append(charRoman[0][num]);
        }else if(num >= 10 && num < 100){
            stringBuilder.append(charRoman[1][num / 10 % 10]);
             intToRoman(num % 10);
        }else if(num >= 100 && num < 1000){
            stringBuilder.append(charRoman[2][num / 100 % 10]);
            intToRoman(num % 100);
        }else if(num >= 1000 && num < 3999){
            stringBuilder.append(charRoman[3][num / 1000 % 10]).append(charRoman[2][num % 1000 / 100 % 10])
            .append(charRoman);

        }

        return stringBuilder.toString();
    }

}
