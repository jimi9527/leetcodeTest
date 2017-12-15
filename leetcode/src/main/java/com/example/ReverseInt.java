package com.example;

/**
 * Created by dengjx on 2017/12/15.
 */

public class ReverseInt {
    public static void main(String[] args){
        ReverseInt reverseInt = new ReverseInt();
        reverseInt.reverse(1534236469);
    }

    public int reverse(int x) {
        boolean flag = false;
        String s = "";
        if(x > Integer.MAX_VALUE && x < Integer.MIN_VALUE){
            return 0;
        }else {
            String str = String.valueOf(x);
            StringBuilder stringBuilder = new StringBuilder();
            char[] strArray = str.toCharArray();
            for (int i = strArray.length; i > 0; i--) {
                if (strArray.length == 1) {
                    s = String.valueOf(strArray[0]);
                    break;
                }
                if (i == strArray.length) {
                    if (strArray[i - 1] != '0') {
                        stringBuilder.append(strArray[i - 1]);
                    } else {
                        //stringBuilder.append(strArray[i - 1]);
                    }
                } else {
                    if (i == 1) {
                        if (strArray[0] == '-') {
                            flag = true;
                        } else {
                            flag = false;
                            stringBuilder.append(strArray[i - 1]);
                        }
                    } else {
                        stringBuilder.append(strArray[i - 1]);
                    }

                    if (flag) {
                        s = "-" + stringBuilder.toString();
                    } else {
                        s = stringBuilder.toString();
                    }
                }
            }
            try {
               int  i = Integer.valueOf(s);
                System.out.println("i:" + i);
                    return i;
            }catch (NumberFormatException e){
                System.out.println("e:"+e);
                return 0;
            }
        }
    }
}
