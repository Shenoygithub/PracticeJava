package com.java.programs;

import java.util.HashMap;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "ashwith";
        HashMap<Character, Integer> removeChar = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(removeChar.containsKey(str.charAt(i))){
                char ch=str.charAt(i);
                int count= removeChar.get(ch);
                count++;
                removeChar.put(ch,count);
            }else{
                removeChar.put(str.charAt(i),1);
            }
        }
        String withoutDuplicate="";
        for (Character character : removeChar.keySet()) {
            withoutDuplicate += character;
        }
        System.out.println(withoutDuplicate);
        System.out.println(removeChar);
    }
}
