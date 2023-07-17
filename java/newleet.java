package com.nadeem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class newleet {
    public static void main(String[] args) {
      String s="(]";
        Stack stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
               stack.push(s.charAt(i));
           }
           if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
              if(stack.empty()){
                  System.out.println("false");
                  break;
              }else{
                  char temp = (char) stack.pop();
                  if(!match(temp,s.charAt(i))){
                      System.out.println("false");
                      break;
                  }
              }
           }
        }
        if(stack.empty()){
            System.out.println("true");
        }
    }
    public static boolean match(char a,char b){
        if(a=='('&&b==')'){
            return true;
        }
        else if(a=='{'&&b=='}'){
            return true;
        }
         else if(a=='['&&b==']'){
            return true;
        }
         else{
             return false;
        }
    }
}
