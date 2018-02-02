package com.example;

/**
 * 排序
 * Created by dengjx on 2018/2/2.
 */

public class BubbleSort {

    // 冒泡排序
    private void bubble(int[] arr){
        int temp;
        for(int j = 0; j < arr.length; j++) {
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] < arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i ++){
            System.out.println("i:"+arr[i]);
        }
    }

    // 选择排序
    private void select(int[] arr){
        int temp;

        for(int j = 0; j < arr.length; j++) {
            for (int i = j+1; i < arr.length; i++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i ++){
            System.out.println("i:"+arr[i]);
        }

    }

    //插入排序
    private  void insert(int[] arr){

    }



    public static void main(String[] args){

        int[] arr = new int[]{6,7,4,3,5,8};
        BubbleSort bubbleSort = new BubbleSort();
      //bubbleSort.bubble(arr);
      // bubbleSort.select(arr);

    }

}
