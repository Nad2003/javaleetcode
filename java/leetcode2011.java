package com.nadeem;

import java.util.Arrays;
import java.util.TreeMap;

public class leetcode2011 {
    public static void main(String[] args) {
        String[] arr={"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        int[] num={17233,32521,14087,42738,46669,65662,43204,8224};
//
        TreeMap<Integer,String>  treemap=new TreeMap<>();
        for (int i = 0; i < num.length; i++) {
            treemap.put(num[i],arr[i]);
        }
//        System.out.println(treemap);
        String[] sortname=new String[arr.length];
        int i=sortname.length-1;
        for (int sort:treemap.keySet()) {
           sortname[i]=treemap.get(sort);
           i--;
        }
        System.out.println(Arrays.toString(sortname));
    }
}
