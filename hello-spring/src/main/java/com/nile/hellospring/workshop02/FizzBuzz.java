package com.nile.hellospring.workshop02;

public class FizzBuzz {
    public String getResult(int num){
        if((num % 3) == 0){
            return "Fizz";
        }
        return String.valueOf(num);
    }
}
