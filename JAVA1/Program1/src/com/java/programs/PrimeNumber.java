package com.java.programs;

public class PrimeNumber {

    public static boolean isPrime(int num){
        if(num<1)
        {
            return true;
        }
        for(int i=2;i<num;i++){
            if(num%2==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPrime(24));
    }
}