package com.nadeem;

import java.util.Stack;

public class leetcode {
    public static void main(String[] args) {
        String s="erase*****";
        Stack<Character> stack =new Stack<>();
        StringBuffer str=new StringBuffer();
        int count=-1;
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while(!stack.empty()){
            char ch=stack.pop();
            if(ch!='*'&&count<0){
                str.append(ch);
            }
            if(ch=='*'){
                count++;
            }
            if(ch!='*'&&count>=0){
                count--;
            }
        }
        System.out.println(str.reverse());
    }
}
