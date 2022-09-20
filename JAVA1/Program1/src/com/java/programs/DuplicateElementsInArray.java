package com.java.programs;

public class DuplicateElementsInArray {

    public static void main(String[] args){
        int arr[] = new int[]{1,3,4,6,7,7,9,2,3,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j])
                   System.out.println(arr[j]);

            }
        }


    }
}
