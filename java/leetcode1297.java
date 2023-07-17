package com.nadeem;

public class leetcode1297 {
    public static void main(String[] args) {
        String[] s = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int count = 1;
        int max=0;
        for (int i = 0; i < s.length; i++) {
            count=1;
            String s1 = s[i];
            int j = 0;
            while (j < s1.length()) {
                if (s1.charAt(j) == ' ') {
                    count++;

                }
                j++;
            }
           if(max<count){
               max=count;
           }
        }
        System.out.println(max);
    }
}