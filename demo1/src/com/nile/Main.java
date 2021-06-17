package com.nile;

import com.nile.MyRange.MyRange;

public class Main {

    public static void main(String[] args) {
        String name = "Name";
        String name2 = new String("Name");
        // String pool
        if(name == "Name"){
            // Print only this
            System.out.println(1);
        }
        if(name2 == "Name"){
            System.out.println(2);
        }

        MyRange myRange = new MyRange("(1,5]");
        System.out.println(myRange.endWithInclude());
        System.out.println(myRange.getResult());
    }
}

