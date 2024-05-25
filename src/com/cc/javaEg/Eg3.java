package com.cc.javaEg;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/6
 * Time: 13:43
 * Description:
 */
public class Eg3 {
    public static void main(String[] args) {
        // 回文数判断: 对称，如12321、3773
        System.out.println(isPalindromic(13431));

        System.out.println(isPalindromicPlus(13431));

        // 找到5位数中所有回文数
//        for (int i = 10000; i < 100000; i++) {
//            if (isPalindromic(i)){
//                System.out.println(i);
//            }
//        }
    }

    // 回文数判断
    public static Boolean isPalindromic(Integer n){
        // 字符串反转
        char[] left = String.valueOf(n).toCharArray();
        char[] right = new char[left.length];
        int j = 0;
        for (int i = left.length-1; i >= 0; i--) {
            right[j] = left[i];
            j++;
        }
        return Arrays.equals(left, right);
    }

    // 回文数判断
    public static Boolean isPalindromicPlus(Integer n){
        StringBuffer buffer = new StringBuffer();
        buffer.append(n);
        String res = buffer.reverse().toString();
        return res.equals(String.valueOf(n));
    }

}
