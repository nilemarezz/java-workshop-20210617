package com.nile.hellospring.workshop01;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        GenerateUUID generateUUID = new GenerateUUID();
        generateUUID.setRandom(new Random());
        System.out.println(generateUUID.generate("nile"));
    }
}
