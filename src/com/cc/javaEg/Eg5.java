package com.cc.javaEg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/7
 * Time: 14:39
 * Description:
 */
public class Eg5 {
    public static void main(String[] args) {
        // "dog loves pig"
        String str = "dog loves pig";

        System.out.println(reverse(str));

        System.out.println(reversePlus(str));
    }

    // 单词顺序反转
    public static String reverse(String str){
        String res = "";
        String[] strs = str.split(" ");
        for (int i = strs.length-1; i >= 0; i--) {
            if (i != 0){
                res += strs[i]+" ";
            } else {
                res += strs[i];
            }
        }
        return res;
    }

    // 单词顺序反转
    public static String reversePlus(String str){
        List<String> list = Arrays.asList(str.split(" "));
        // 集合内容反转
        Collections.reverse(list);
        String res = "";
        for (int i = 0; i < list.size(); i++) {
            if (i!=list.size()-1){
                res += list.get(i)+" ";
            } else {
                res += list.get(i);
            }
        }
        return res;
    }

}

