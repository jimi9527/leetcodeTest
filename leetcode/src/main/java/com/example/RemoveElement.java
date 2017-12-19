package com.example;

/**
 * Created by dengjx on 2017/12/19.
 */

public class RemoveElement {
    public int removeElement(int[] nums, int val){
        int length = 0;
        if(nums.length >0) {
                for (int i = nums.length - 1; i >= 0; i--) {
                    if (nums[i] == val) {
                        length = length + 1;
                    }
                }
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == val) {
                        for (int j = nums.length - 1; j >= 0; j--) {
                            if (j > i) {
                                if (nums[j] != val) {
                                    int temp;
                                    temp = nums[i];
                                    nums[i] = nums[j];
                                    nums[j] = temp;
                                    break;
                                }
                            }

                        }
                    }
                }
        }
        int [] newnums = new int[nums.length - length];
        if(nums.length -length != 0){
            for(int i = 0; i < nums.length -length; i++){
                newnums[i] = nums[i];
            }
        }
        nums = newnums;
        for(int i = 0; i < nums.length; i++){
            System.out.print("num:"+nums[i]);
        }
        System.out.println();
        System.out.print("length:"+ length);
        return length;
    }

    public int remove(int[] nums, int val ){
        int m = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }

    public static void main(String[] args){
        RemoveElement removeElement = new RemoveElement();
        removeElement.remove(new int[]{1},1);
    }
}
