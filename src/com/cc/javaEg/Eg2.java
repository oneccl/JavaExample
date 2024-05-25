package com.cc.javaEg;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/6
 * Time: 13:38
 * Description:
 */
public class Eg2 {
    public static void main(String[] args) {
        Integer i = 12322;
        String s = "word";
        System.out.println(reverse(i));
        System.out.println(reverse(s));
    }

    // Object类型内容反转，以字符串形式输出
    public static String reverse(Object obj){
        StringBuffer buffer = new StringBuffer();
        buffer.append(obj);
        return buffer.reverse().toString();
    }

}
