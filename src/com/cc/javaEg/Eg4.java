package com.cc.javaEg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/6
 * Time: 13:45
 * Description:
 */
public class Eg4 {
    public static void main(String[] args) {
        // 获取公共前缀
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"flower","glow","flight"};
        String prefix1 = getCommonPrefix(strs2);
        System.out.println("公共前缀："+prefix1);

        String prefix2 = getCommonPrefixPlus(strs2);
        System.out.println("公共前缀："+ prefix2);
    }

    // 编写一个函数来查找字符串数组中的最长公共前缀，如果不存在公共前缀，返回空字符串""
    // 输入: ["flower","flow","flight"] 输出: "fl"
    // 输入: ["dog","car","car"]        输出: ""
    public static String getCommonPrefix(String[] strs){
        List<Integer> lengths = new ArrayList<>();
        for (String str : strs) {
            lengths.add(str.length());
        }
        Integer lenMin = Collections.min(lengths);
        boolean flag = true;
        String s;
        List<String> prefixs = new ArrayList<>();
        for (int i = 0; i < lenMin; i++) {
            String[] subs = new String[strs.length];
            for (int j = 0; j < strs.length; j++) {
                String sub = strs[j].substring(0, i + 1);
                subs[j]=sub;
            }
            s = subs[0];
            for (int k = 1; k < subs.length; k++) {
                if (!s.equals(subs[k])) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                prefixs.add(s);
            }
        }
        return prefixs.size()!=0 ? prefixs.get(prefixs.size()-1) : "\"\"";
    }

    // 与第一个比较法
    public static String getCommonPrefixPlus(String[] strs){
        // ["flower","flow","flight"]
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            String sub = first.substring(0, i+1);
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(sub)){
                    return first.substring(0, i).equals("") ? "\"\"":first.substring(0,i);
                }
            }
        }
        return "\"\"";
    }

}
