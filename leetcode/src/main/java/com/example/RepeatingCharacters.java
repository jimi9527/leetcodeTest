package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dengjx on 2017/12/8.
 */

public class RepeatingCharacters {
    //先求出父字符串的所有子字符串
    public void getSubChar(String s) {
        List<String> list = new ArrayList<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                String newstr = s.substring(i, j);
                list.add(newstr);
            }
        }
        //  findLength(list);
        int max;
        List<String> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String c = list.get(i);
            char[] arrayStr = list.get(i).toCharArray();
            for (int k = 0; k < arrayStr.length; k++) {
                for (int j = k + 1; j < arrayStr.length; j++) {
                    String a = String.valueOf(arrayStr[k]);
                    String b = String.valueOf(arrayStr[j]);
                    if (a.equals(b)) {
                        newList.add(list.get(i));
                        break;
                    }
                }
            }
        }
        list.removeAll(newList);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i):" + list.get(i));
        }

        if (list.size() > 0) {
            max = list.get(0).toCharArray().length;
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (max > list.get(j).toCharArray().length) {
                    } else {
                        max = list.get(j).toCharArray().length;
                    }
                }
            }
        } else {
            max = 0;
        }

        System.out.println(max + "max:");

    }

    public static void main(String[] args) {
        RepeatingCharacters repeatingCharacters = new RepeatingCharacters();
        repeatingCharacters.getSubChar("biyastksrdnilpdytdqrdnnkary");
    }
}
