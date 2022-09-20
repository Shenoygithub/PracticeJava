package com.java.programs;

public class PalindromeNumber {
    public static void isPalindrome(int num){
        int r=0,sum=0;
        int t;
        t=num;
                while(num>0){
                    r=num%10;
                    sum=(sum*10)+r;
                    num=num/10;
                }
                if(t==sum) {
                    System.out.println("It is Palindrome");
                }
                    else{
                        System.out.println("It is not a Palindrome");
                    }
                }

                public static void main(String[] args){
        isPalindrome(111);
    }


}
