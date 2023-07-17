package com.nadeem;

import java.util.Arrays;

public class leetcodeXor {
    public static void main(String[] args) {
//        int[] arr={3,4,5,6,7,8};
//        System.out.println(endi(arr));
//        System.out.println(total(arr));
//        System.out.println(endi(arr)+total(arr));
//        System.out.println(4^6);
//        int[] arr={13,25,83,77};
//        String s="";
//        for (int i = 0; i < arr.length; i++) {
//            s+=arr[i];
//        }
//        String s1="nadeem";
//        System.out.println(Arrays.toString(s1.toCharArray()));
//        System.out.println(s);
//        System.out.println(Arrays.toString(s.toCharArray()));
//        System.out.println('1'-'0');
        int n=521;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        System.out.println(sum);
    }
//    public static int endi(int[] arr){
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(i==j){
//                    sum=sum+arr[i];
//                }else{
//                    sum+=arr[i]^arr[j];
//                }
//            }
//        }
//        return sum;
//    }
//    public static int total(int[] arr){
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            sum^=arr[i];
//            //System.out.println(sum);
//        }
//        return sum;
//    }
}
