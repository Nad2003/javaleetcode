package com.nadeem;

import java.util.Arrays;

public class leetcode238 {
    public static void main(String[] args) {
//        String s="b";
//        String s1="ahbgdc";
//        int i=0,j=0;
//        boolean flag=true;
//        while(i<s.length()&&j<s1.length()){
//            if(s.charAt(i)==s1.charAt(j)){
//
//                flag=true;
//                i++;
//                j++;
//            }
//           else if(s.charAt(i)!=s1.charAt(j)){
//                j++;
//            }
//        }
//        if (i == s.length() && j == s1.length()) {
//            System.out.println(flag);
//        }
//        else if(i!= s.length()&&j== s1.length()){
//            System.out.println(false);
//        }
//        else if(i== s.length()&&j!= s1.length()){
//            System.out.println(true);
//        }
//        else{
//            System.out.println("i dont know");
//        }

        String s="lbg";
        String t="g";
        int i=0;
        int j=0;
        int c=0;
        while(i<s.length()&&j<t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else if(s.charAt(i)!=t.charAt(j)){
                j++;
            }
            else {
                while (j < t.length()) {
                    j++;
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
