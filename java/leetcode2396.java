package com.nadeem;

public class leetcode2396 {
    public static void main(String[] args) {
//        System.out.println(convert(10,3));
       String str="";
        int n=9;
        for (int i = 2; i <=n-2; i++) {
            str=convert(n,i);
            System.out.println(str);
            System.out.println(riv(str));
            if (str.equals(riv(str))==false){
                System.out.println("false");
                break;
            }else{
                System.out.println(i+" -> "+"true");
            }
        }

    }
//    public static StringBuffer convert(int n, int base){
//        StringBuffer bin=new StringBuffer();
//        while(n>0){
//            int rem=n%base;
//            if(base==16){
//                   if (rem==10){
//                    bin.append('A');
//                } else  if (rem==11){
//                       bin.append('B');
//                   } else  if (rem==12){
//                       bin.append('C');
//                   } else  if (rem==13){
//                       bin.append('D');
//                   } else  if (rem==14){
//                       bin.append('E');
//                   } else  if (rem==15){
//                       bin.append('F');
//                   }else {
//                       bin.append(rem);
//                   }
//            }else {
//                bin.append(rem);
//            }
//
//            n/=base;
//        }
//        return bin.reverse();
//    }//Integer.toString(Integer.parseInt(number, base), newBase)

    public  static String riv(String str){
        StringBuffer str1=new StringBuffer(str);
        return str1.reverse().toString();
    }
    public static String convert(int num, int newBase)  {
        if ((newBase < 2 || newBase > 10) && newBase != 16) {
            throw new IllegalArgumentException("New base must be from 2 - 10 or 16");
        }
        String result = "";
        int remainder;
        while (num > 0) {
            remainder = num % newBase;
            if (newBase == 16) {
                if (remainder == 10) {
                    result += 'A';
                } else if (remainder == 11) {
                    result += 'B';
                } else if (remainder == 12) {
                    result += 'C';
                } else if (remainder == 13) {
                    result += 'D';
                } else if (remainder == 14) {
                    result += 'E';
                } else if (remainder == 15) {
                    result += 'F';
                } else {
                    result += remainder;
                }
            } else {
                result += remainder;
            }
            num /= newBase;
        }
        return new StringBuffer(result).reverse().toString();
    }

}
/*

* */
