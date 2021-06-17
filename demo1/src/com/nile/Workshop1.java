package com.nile;

public class Workshop1 {
    public static void main(String[] args) {
        String input = "(1,5]";
        int firstNum = Character.getNumericValue(input.charAt(1));
        int lastNum = Character.getNumericValue(input.charAt(3));
        firstNum = input.startsWith("[") ? firstNum : firstNum + 1;
        lastNum = input.endsWith("]") ? lastNum + 1 : lastNum;
        for (int i = firstNum; i < lastNum; i++) {
            System.out.print(i);
        }

    }
}
