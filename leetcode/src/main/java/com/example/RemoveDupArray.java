package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dengjx on 2017/12/12.
 */

public class RemoveDupArray {
    public int removeDuplicates(int[] nums){
        int num = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
             if(!list.contains(nums[i])){
                 list.add(nums[i]);
             }
        }
        if(list.size() > 0){
            num = list.size();
        }
        Integer tempInteger[] = new Integer[list.size()];
        int tempInt[] = new int[list.size()];
        list.toArray(tempInteger);
        for(int j = 0; j < tempInteger.length; j++){
            tempInt[j] = tempInteger[j].intValue();
        }
        nums = tempInt;

        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i):" + nums[i]);
        }

        return num;
    }
    public static void main(String[] args) {
        RemoveDupArray removeDupArray = new RemoveDupArray();
        removeDupArray.removeDuplicates(new int[]{1,1,2});
    }
}
