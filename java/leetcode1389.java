package com.nadeem;

import java.util.Arrays;

public class leetcode1389 {
    public static void main(String[] args) {
        //2433
      String  s ="ab3a";
      String s1="";
        for(int i=0;i<s.length();i++){
            if(check(s.charAt(i))==true){
                s1+=s.charAt(i);
            }
        }
        String s2=s1.toLowerCase();
        System.out.println(s2);
        System.out.println(s2.equals(rivers(s2)));

    }
    public static String rivers(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        return s1;
    }
    public static boolean check(char ch){
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')){
            return true;
        }
        return false;
    }
}
