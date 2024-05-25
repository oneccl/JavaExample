package com.cc.javaEg;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/7
 * Time: 15:13
 * Description:
 */
public class Eg6 {
    public static void main(String[] args) {
        // 字符串加密
        String str = "abc";
        System.out.println(encrypt(str));
    }

    // 输入一个字符串，将这个字符串的每一个字符加4得到新的字符串
    public static String encrypt(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res += (char)(str.charAt(i)+4);
        }
        return res;
    }

}
