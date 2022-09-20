package com.java.programs;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args){
        int arr[] = new int[]{1,9,2,7,8,2,6,10,5};
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                int temp=0;
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
            System.out.println(arr[i]);
        }
    }
}
