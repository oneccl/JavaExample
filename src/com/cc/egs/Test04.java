package com.cc.egs;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2024/8/5
 * Time: 23:24
 * Description:
 */
public class Test04 {

    // 739. 每日温度
    // 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer
    // 其中 answer[i] 是指对于第 i 天，下一个更高温度出现在几天后。如果气温在这之后都不会升高，请在该位置用 0 来代替。
    // 输入: temperatures = [73,74,75,71,69,72,76,73]
    // 输出: [1,1,4,2,1,1,0,0]
    // 输入: temperatures = [30,40,50,60]
    // 输出: [1,1,1,0]
    // 输入: temperatures = [30,60,90]
    // 输出: [1,1,0]
    public static void main(String[] args) {
        int[] temperatures = {30,60,90};
        int[] answer = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int count = 0;
            for (int j = i+1; j < temperatures.length; j++) {
                count++;
                if (temperatures[j] > temperatures[i]) {
                    answer[i] = count;
                    break;
                } else {
                    answer[i] = 0;
                }
            }
        }
        answer[answer.length-1]=0;
        System.out.println(Arrays.toString(answer));

    }
}
