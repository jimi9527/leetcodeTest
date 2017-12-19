package com.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by dengjx on 2017/12/19.
 */

public class ThreeNums {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> listAll = new ArrayList<>();
        List<List<Integer>> newlist = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<List<Integer>>();
        if (nums.length >= 3) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if ((nums[i] + nums[j] + nums[k]) == 0) {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            listAll.add(list);
                        }
                    }

                }
            }
            for (int a = 0; a < listAll.size(); a++) {
                for (int b = 0; b < listAll.get(a).size(); b++) {
                    System.out.print("***" + listAll.get(a).get(b));
                }
                System.out.println();
            }
            System.out.println("排除相同的list");
            // remove duplicated items.
            for (int i = 0; i < listAll.size(); i++){
                if(set.add(listAll.get(i))){
                    newlist.add(listAll.get(i));
                }
            }
        }
        for (int i = 0; i < newlist.size(); i++) {
            for (int j = 0; j < newlist.get(i).size(); j++) {
                System.out.print("***" + newlist.get(i).get(j));
            }
            System.out.println();
        }
        return newlist;
    }

    public boolean commonList(List<Integer> list1, List<Integer> list2) {
        int a = 0;
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    a = a + 1;
                }
            }
        }

        if (a >= 3) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
        ThreeNums threeNums = new ThreeNums();
        threeNums.threeSum(new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0});
    }
}
