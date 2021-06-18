package com.nile.hellospring.workshop01;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        GenerateUUID generateUUID = new GenerateUUID();
        generateUUID.setRandom(new MyRandom());
        System.out.println(generateUUID.generate("nile"));
    }
}

class MyRandom implements IRandom{

    @Override
    public int nextInt(int bound) {
        // write own logic
        return new Random().nextInt(10);
    }
}

