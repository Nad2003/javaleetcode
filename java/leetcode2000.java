package com.nadeem;

public class leetcode2000 {
    public static void main(String[] args) {
        String word="abcdefg";
//        char ch='z';

        int index=2;
//        if (word.indexOf(ch)==-1){
//            System.out.println(word);
//        }else{
//            for (int i = 0; i < word.length(); i++) {
//                if(word.charAt(i)==ch){
//                    break;
//                }
//                index++;
//            }
            //System.out.println(index);
            String s=word.substring(0,index);
            System.out.println(riv(s)+word.subSequence(index,word.length()));
        }
//    }



    public static String riv(String arr){
        String s="";
        for (int i = arr.length()-1; i >=0 ; i--) {
            s=s+arr.charAt(i);
        }
        return s;
    }
}
