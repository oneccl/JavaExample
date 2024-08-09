package com.cc.egs;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2024/8/5
 * Time: 11:16
 * Description:
 */
public class Test03 {
    // 1044. 最长重复子串
    // 给你一个字符串 s ，考虑其所有 重复子串 ：即 s 的（连续）子串，在 s 中出现 2 次或更多次。这些出现之间可能存在重叠。
    // 返回 任意一个 可能具有最长长度的重复子串。如果 s 不含重复子串，那么答案为 "" 。
    // 输入：s = "banana"
    // 输出："ana"
    // 输入：s = "abcd"
    // 输出：""
    // 2 <= s.length <= 3 * 104
    // s 由小写英文字母组成
    public static void main(String[] args) {
        String s = "abcd";
        int max_sub_count = s.length()-1;
        for (int i=max_sub_count; i>=2; i--){
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < s.length()-i+1; j++) {
                String subx = s.substring(j, j + i);
                map.put(subx, map.getOrDefault(subx, 0)+1);
            }
            if (Collections.max(map.values())>=2){
                List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
                list.sort((e1,e2)->Integer.compare(e2.getValue(), e1.getValue()));
                System.out.println(list.get(0).getKey());
                return;
            }
        }
        System.out.println("\"\"");

    }

}
