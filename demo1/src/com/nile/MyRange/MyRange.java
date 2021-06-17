package com.nile.MyRange;

import static java.lang.Integer.parseInt;

public class MyRange {
    private String input;
    private int firstNum;
    private int lastNum;

    public MyRange(String input) {
        int firstNum = parseInt(input.substring(1, 2));
        int lastNum = parseInt(input.substring(3, 4));
        this.input = input;
        this.firstNum = startWithInclude() ? firstNum : firstNum + 1;
        this.lastNum = endWithInclude() ? lastNum  : lastNum -1;
    }
    
    public int getFirstNum() {
        return firstNum;
    }

    public int getLastNum() {
        return lastNum;
    }

    public boolean startWithInclude() {
        return this.input.startsWith("[");
    }

    public boolean startWithExclude() {
        return this.input.startsWith("(");
    }

    public boolean endWithInclude() {
        return this.input.endsWith("]");
    }

    public boolean endWithExclude() {
        return this.input.endsWith(")");
    }

    public String getResult() {
        String result = "";
        for (int i = firstNum; i <= lastNum ; i ++){
            result += i;
            if(lastNum != i) result += ",";
        }
        return result;
    }
}
