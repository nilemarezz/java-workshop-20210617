package com.nile.hellospring.workshop01;

import java.util.Random;

public class GenerateUUID {
   private IRandom random ;

    public void setRandom(IRandom random) {
        this.random = random;
    }

    public String generate(String name) {
        int randomValue = random.nextInt(10);
        return "xyz"+ name + randomValue;
    }
}
