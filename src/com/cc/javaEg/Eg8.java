package com.cc.javaEg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/7
 * Time: 15:27
 * Description:
 */
public class Eg8 {
    public static void main(String[] args) {
        // 双色球 红[1,33]：6个 蓝[1,16]：1个
        Random random = new Random();
        HashSet<Integer> red = new HashSet<>();
        do {
            red.add(random.nextInt(33) + 1);
        } while (red.size() != 6);
        List<Integer> res = new ArrayList<>(red);
        res.add(random.nextInt(16)+1);
        System.out.println(res);
    }
}
