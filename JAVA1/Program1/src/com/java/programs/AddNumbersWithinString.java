package com.java.programs;

public class AddNumbersWithinString {

    public static void main(String[] args) {
        String str = "HY18HY18";
        int sum = 0;
        char[] sumChar = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            String cont = "0";
            if (Character.isDigit(sumChar[i])) {
                cont += sumChar[i];
                i++;
                while (i < str.length() && Character.isDigit(sumChar[i])) {
                    cont += sumChar[i];
                    i++;
                }
            }
            sum += Integer.parseInt(cont);

        }
        System.out.println(sum);

    }
}

