package com.cc.algorithms.sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/1/16
 * Time: 9:00
 * Description:
 */
public class BubbleSort {

    // 冒泡排序
    /*
    比较相邻的元素；如果第一个比第二个大，就交换他们两个
    对每对相邻元素做同样的工作，从开始第一对到结尾的最后一对；最后的元素应该是最大的数
    针对所有的元素重复以上的步骤，除了最后一个
    持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
    */

    public static void main(String[] args) {
        int[] arr = {3,4,3,1,3,2,6,5,7,5};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr){
        // 共比较length-1次
        for (int j = 0; j < arr.length-1; j++) {
            // 每一轮都得到一个最大的数放到最后，每一轮比较的数都少一个
            for (int i = 0; i < arr.length-1-j; i++) {
                if (arr[i] > arr[i+1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
