package com.nile.hellospring.workshop02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    @DisplayName("Test with number = 1")
    public void Test1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(1);
        assertEquals("1" , result);
    }

    @Test
    @DisplayName("Test with number = 2")
    public void Test2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(2);
        assertEquals("2" , result);
    }

    @Test
    @DisplayName("Test with number = 3")
    public void Test3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(3);
        assertEquals("Fizz" , result);
    }
}