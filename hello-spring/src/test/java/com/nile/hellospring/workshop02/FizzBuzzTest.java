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

    @Test
    @DisplayName("Test with number = 4")
    public void Test4(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(4);
        assertEquals("4" , result);
    }

    @Test
    @DisplayName("Test with number = 5")
    public void Test5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(5);
        assertEquals("Buzz" , result);
    }

    @Test
    @DisplayName("Test with number = 6")
    public void Test6(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(6);
        assertEquals("Fizz" , result);
    }

    @Test
    @DisplayName("Test with number = 7")
    public void Test7(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(7);
        assertEquals("7" , result);
    }

    @Test
    @DisplayName("Test with number = 8")
    public void Test8(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(8);
        assertEquals("8" , result);
    }

    @Test
    @DisplayName("Test with number = 9")
    public void Test9(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(9);
        assertEquals("Fizz" , result);
    }

    @Test
    @DisplayName("Test with number = 10")
    public void Test10(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(10);
        assertEquals("Buzz" , result);
    }

    @Test
    @DisplayName("Test with number = 11")
    public void Test11(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(11);
        assertEquals("11" , result);
    }

    @Test
    @DisplayName("Test with number = 12")
    public void Test12(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(12);
        assertEquals("Fizz" , result);
    }

    @Test
    @DisplayName("Test with number = 15")
    public void Test15(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(15);
        assertEquals("FizzBuzz" , result);
    }

    @Test
    @DisplayName("Test with number = 30")
    public void Test30(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(30);
        assertEquals("FizzBuzz" , result);
    }


}