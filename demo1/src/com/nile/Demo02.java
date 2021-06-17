package com.nile;

public class Demo02 {
    public static void main(String[] args) {
        // String pool vs object string
        String name = "Matas";
        String name2 = new String("M");

        if(name == "Matas"){
            // print only this
            System.out.println(1);
        }
        if(name2.equals("M")){
            System.out.println(2);
        }

        for (int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }

    }
}
