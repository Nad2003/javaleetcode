package com.nadeem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class leetcode1636 {
    public static void main(String[] args) {
        String str = "G()(al)";
        //(al)G(al)()()G
        char[] str1 = str.toCharArray();
        String s = "";
        int i = 0;
        boolean flag=false;
    while(i<str1.length){
        if(str1[i]=='('){
            flag=true;
            i++;
        }
       else if(flag==true&&str1[i]==')'){
            s+='o';
            flag=false;
            i++;
        }
       else{
          if(str1[i]!=')'){
              s+=str1[i];
              flag=false;
//              i++;
          }
i++;

        }
    }
        System.out.println(s);
    }
    }

//[G, (, ), (, a, l, )]