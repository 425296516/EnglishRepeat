package com.baidu.android.voicedemo;

/**
 * Created by zhangcirui on 16/6/6.
 */
public class WordCounts {

    public static int countNum(String str) {
        String newStr;
        char c = str.charAt(str.length() - 1);
        if (!((c >= 65 && c <= 90) || (c >= 97 && c <= 125))) {
            newStr = str.substring(0, str.length() - 1);
            return count(newStr);
        } else {
            return count(str);
        }
    }

    public static int count(String str) {
        int count = 0;
        String string = str;
        String s[] = string.split(" |,|\\?|\\.");//split()里面是正则表达式
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
            count++;//计数变量
        }
        System.out.println("这段话共有" + count + "单词");
        return count;
    }

}
