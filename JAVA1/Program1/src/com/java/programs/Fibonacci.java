package com.java.programs;

import org.w3c.dom.ls.LSOutput;

public class Fibonacci {
   public static void main(String[] args){
       int n1=0, n2=1, n3, count=10;
       for(int i=1;i<=count;i++)
       {
           n3=n1+n2;
           System.out.println(""+n1);//starts printing from n1
           n1=n2;
           n2=n3;


        }
    }
}


//    void main( )
//    {
//        int num, first, second, count, third;
//        clrscr( );
//        cout<<"Enter the number limit for Fibonacci Series"<<endl;
//        cin>>num;
//        first = 0;
//        second = 1;
//        cout<<first<<"\t"<<second;
//        third = first + second;
//        for( count = 2; third<=num; count++)
//        {
//            cout<<"\t"<<third
//            first = second;
//            second = third;
//            third = first + second;
//        }
//        cout<<"\n Total terms = "<<count<<endl;