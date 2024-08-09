package com.cc.egs;


import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2024/7/29
 * Time: 11:18
 * Description:
 */
public class Test01 {

    public static void main(String[] args) {
        String[] arr = {"aa", "bb", "cc", "dd", "bb", "aa", "bb"};
        List<String> list = Arrays.asList(arr);
        System.out.println(calculateStringCount(list));
        String str = "abcdefaab";
        System.out.println(calculateCharacterCount(str));

    }

    private static Map<Character, Integer> calculateCharacterCount(String str) {
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        return map;
    }

    private static Map<String, Integer> calculateStringCount(List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        return map;
    }






}
