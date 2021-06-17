package com.nile;

import static java.lang.Integer.parseInt;

public class Workshop1 {
    public static void main(String[] args) {
        String input = "(1,5]";
        int firstNum = parseInt(input.substring(1,2));
        int lastNum = parseInt(input.substring(3,4));
        firstNum = input.startsWith("[") ? firstNum : firstNum + 1;
        lastNum = input.endsWith("]") ? lastNum + 1 : lastNum;
        for (int i = firstNum; i < lastNum; i++) {
            System.out.print(i);
        }

    }
}
