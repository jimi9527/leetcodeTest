package com.example;

import java.util.ArrayList;
import java.util.List;

import sun.rmi.runtime.Log;

/**
 * Created by dengjx on 2017/12/7.
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
         /*   if (nums[i] + nums[i] == target) {
                list.add(i);
            }*/
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"----");
        }
        List<Integer> newlist = new ArrayList<>();
        for(int i: list){
            if(!newlist.contains(i)){
                newlist.add(i);
            }
        }
        System.out.println();
        int[] newNums = new int[newlist.size()];
        for(int i = 0; i < newlist.size(); i++){
            newNums[i] = newlist.get(i);
        }

        for (int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i]+"----");
        }

        return newNums;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.twoSum(new int[]{3,2,4}, 6);
    }
}
