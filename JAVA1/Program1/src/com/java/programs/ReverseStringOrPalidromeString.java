package com.java.programs;

public class ReverseStringOrPalidromeString {

    public static void main(String[] args) {

        String str = "SELENIUM";
        int len = str.length();
        String rev = "";
        for(int i=len-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev))
        {
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
