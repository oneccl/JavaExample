package com.cc.javaEg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/6
 * Time: 10:19
 * Description:
 */
public class Eg1 {
    public static void main(String[] args) {
        // 数组/List去重
        Integer[] ints = {2,7,9,3,7,12,9,7};
        List<Object> list = Arrays.asList(ints);
        System.out.println(removeMultiSort(list));
        System.out.println(removeMulti(list));
    }

    // 去重并从小到大排序
    public static <T> List<T> removeMultiSort(List<T> list) {
        HashSet<T> integers = new HashSet<>(list);
        return new ArrayList<>(integers);
    }

    // 去重
    public static <T> List<T> removeMulti(List<T> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

}
