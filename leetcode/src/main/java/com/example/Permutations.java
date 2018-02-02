package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 给定不同数字的集合，返回所有可能的排列。
 * Created by dengjx on 2018/1/28.
 */

public class Permutations {
        public List<List<Integer>> permute(int[] nums){
            List<List<Integer>> list = new ArrayList<>();

            for(int i = 0; i < nums.length; i++){
                List<Integer> listInt = new ArrayList<>();
                List<Integer> listIntReserve = new ArrayList<>();
                listInt.add(nums[i]);
                listIntReserve.add(nums[i]);
                for(int j = 0; j < nums.length; j++){
                        if(i != j){
                            listInt.add(nums[j]);
                        }
                }
                for(int k = nums.length - 1; k >= 0; k--){
                    if(i != k){
                        listIntReserve.add(nums[k]);
                    }
                }
                list.add(listIntReserve);
                list.add(listInt);
            }
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).size(); j++){
                System.out.print("-----" + list.get(i).get(j));
            }
            System.out.println();
        }

            return list;
        }

        public static void main(String[] args){
            Permutations permutations = new Permutations();
            permutations.permute(new int[]{1,2,3,4});
        }
}
