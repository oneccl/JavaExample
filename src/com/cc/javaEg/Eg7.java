package com.cc.javaEg;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/7
 * Time: 15:22
 * Description:
 */
public class Eg7 {
    public static void main(String[] args) {
        // 鸡兔同笼 头36 腿96
        int j;
        for (int t = 0; t <= 36; t++) {
            j = 36-t;
            if (j*2+t*4 == 96){
                System.out.println("鸡："+j+"\t兔："+t);
                break;
            }
        }
    }
}
