package com.cc.egs;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2024/8/2
 * Time: 23:00
 * Description:
 */
public class Test02 {

    public static void main(String[] args) {
        // 反转数组
        Integer[] ints = {1, 2, 3};
        List<Integer> list = new LinkedList<>();
        for (int i = ints.length-1; i >= 0; i--) {
            list.add(ints[i]);
        }
        System.out.println(list);

    }


}
