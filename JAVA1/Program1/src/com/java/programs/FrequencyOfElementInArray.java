package com.java.programs;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementInArray {

    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,3,4,5,6,7,7,8,9,9,1};
        int n = arr.length;

        countFreq(arr, n);
    }
    static void countFreq(int arr[], int n){
        HashMap<Integer, Integer> result = new HashMap<>();
        for(int i=0;i<n;i++){
            if (result.containsKey(arr[i])) {
                result.put(arr[i], result.get(arr[i]) + 1);
            }
            else{
                result.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> i: result.entrySet()){//setting iterator i to print the values
            System.out.println(i.getKey()+" "+ i.getValue());
        }
    }
}
