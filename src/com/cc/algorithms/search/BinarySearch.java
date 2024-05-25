package com.cc.algorithms.search;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/3/30
 * Time: 17:12
 * Description:
 */
public class BinarySearch {

    // 二分查找（折半查找）
    /*
    要求待查找的序列有序；每次取中间位置的值与待查关键字比较，若相等则返回索引
    若中间位置的值大于待查关键字，则继续在左表中进行折半查找
    若中间位置的值小于待查关键字，则继续在右表中进行折半查找；以此类推，否则返回-1
    */

    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11,17};  // 已排序序列
        int targetEle = 5;  // 目标元素
        System.out.println(binarySearch(arr, targetEle));
    }

    private static int binarySearch(int[] arr, int targetEle) {
        int sta = 0;
        int end = arr.length-1;
        int mid;
        while (sta <= end){
            mid = (sta+end)/2;
            if (targetEle<arr[mid]){
                end = mid-1;
            } else {
                sta = mid+1;
            }
            if (targetEle==arr[mid]){
                return mid;
            }
        }
        return -1;
    }


}
