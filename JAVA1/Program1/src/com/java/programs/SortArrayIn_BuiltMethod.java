package com.java.programs;

import java.util.Arrays;

public class SortArrayIn_BuiltMethod {

    public static void main(String[] args){
        int arr[] = new int[]{9,2,5,8,1,7,6};
        Arrays.sort(arr);
        for(int i=0; i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
