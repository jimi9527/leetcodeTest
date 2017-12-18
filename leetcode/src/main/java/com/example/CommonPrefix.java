package com.example;

/**
 * Created by dengjx on 2017/12/18.
 */

public class CommonPrefix {
    // 比较数组中两两个字符串的最长的前缀字符串
    public String longestCommonPrefix(String[] strs) {
        int max = 0;
        String longString = "";
        if (strs.length == 1) {
            longString = strs[0];
        } else {
            for (int i = 0; i < strs.length; i++) {
                for (int j = i + 1; j < strs.length; j++) {
                    if (strs[i].length() > strs[j].length()) {
                        for (int k = 1; k <= strs[j].length(); k++) {
                            String strsub = strs[j].substring(0, k);
                            System.out.println("strsub:" + strsub);
                            if (strs[i].startsWith(strsub)) {
                                if (strsub.length() > max) {
                                    max = strsub.length();
                                    longString = strsub;
                                }
                            }
                        }
                    } else if (strs[i].length() == strs[j].length()) {

                        if (strs[i].equals(strs[j])) {
                            if (strs[i].length() > max) {
                                max = strs[i].length();
                                longString = strs[i];
                            }
                        } else {
                            for (int k = 1; k <= strs[i].length(); k++) {
                                String strsub = strs[i].substring(0, k);
                                System.out.println("strsub:" + strsub);
                                if (strs[j].startsWith(strsub)) {
                                    if (strsub.length() > max) {
                                        max = strsub.length();
                                        longString = strsub;
                                    }
                                }
                            }
                        }

                    } else {
                        for (int k = 1; k <= strs[i].length(); k++) {
                            String strsub = strs[i].substring(0, k);
                            System.out.println("strsub:" + strsub);
                            if (strs[j].startsWith(strsub)) {
                                if (strsub.length() > max) {
                                    max = strsub.length();
                                    longString = strsub;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("longString:" + longString);
        return longString;
    }

    // 比较数组中字符串最长的前缀字符串
    public String longestPreifx(String[] strs) {
        String longString = "";
        String compareString;
        if (strs.length == 1) {
            longString = strs[0];
        } else if (strs.length > 1) {
            compareString = strs[0];
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].equals("")) {
                    longString = "";
                    break;
                }
                if (strs[0].length() == 1) {
                    if (strs[i].startsWith(strs[0])) {
                        longString = strs[0];
                    } else {
                        longString = "";
                    }
                } else {

                    for (int j = 1; j <= compareString.length(); j++) {
                        String strsub = compareString.substring(0, j);
                        System.out.println("strsub:" + strsub);
                        if (strs[i].startsWith(strsub)) {
                            longString = strsub;
                        } else {
                            longString = "";
                        }
                    }
                    compareString = longString;
                }
            }
        }
        System.out.println("longString:" + longString);
        return longString;
    }

    public String longestCompare(String[] strs) {

        String compareString = "";
        if (strs.length == 1) {
            compareString = strs[0];
        }else if(strs.length == 0) {

        } else {
            compareString = strs[0];
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].equals("")) {
                    compareString = "";
                    break;
                }

                StringBuilder stringBuilder = new StringBuilder();
                char[] compareArray = compareString.toCharArray();
                char[] otherArray = strs[i].toCharArray();
                if (compareArray.length >= otherArray.length) {
                    for (int j = 0; j < otherArray.length; j++) {
                          if(otherArray[0] == compareArray[0]){
                         if(otherArray[j] == compareArray[j]){
                             stringBuilder.append(otherArray[j]);
                         }}
                    }
                }else {
                    for (int j = 0; j < compareArray.length; j++) {
                        if(otherArray[0] == compareArray[0]) {
                            if (otherArray[j] == compareArray[j]) {
                                stringBuilder.append(otherArray[j]);
                            }
                        }
                    }
                }
                compareString = stringBuilder.toString();

            }

        }
        System.out.println("compareString :" + compareString);
        return compareString;
    }


    public static void main(String[] args) {
        CommonPrefix commonPrefix = new CommonPrefix();
        commonPrefix.longestCompare(new String[]{"ac","a","ccc"});
    }
}
