package com.nile.MyRange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRangeTest {

    @Test
    void startWithInclude() {
        String input = "[1,5]";
        MyRange myRange = new MyRange(input);
        assertTrue(myRange.startWithInclude());
    }

    @Test
    void startWithExclude() {
        String input = "(1,5]";
        MyRange myRange = new MyRange(input);
        assertTrue(myRange.startWithExclude());
    }

    @Test
    void endWithInclude() {
        String input = "(1,5]";
        MyRange myRange = new MyRange(input);
        assertTrue(myRange.endWithInclude());
    }

    @Test
    void endWithExclude() {
        String input = "(1,5)";
        MyRange myRange = new MyRange(input);
        assertTrue(myRange.endWithExclude());
    }

    @Test
    void firstNumAndstartWithInclude() {
        String input = "[1,5]";
        MyRange myRange = new MyRange(input);
        assertEquals(1 , myRange.getFirstNum());
    }

    @Test
    void firstNumAndstartWithExclude() {
        String input = "(1,5]";
        MyRange myRange = new MyRange(input);
        assertEquals(2 , myRange.getFirstNum());
    }

    @Test
    void lastNumAndendWithInclude() {
        String input = "[1,5]";
        MyRange myRange = new MyRange(input);
        assertEquals(5 , myRange.getLastNum());
    }

    @Test
    void lastNumAndendWithExclude() {
        String input = "(1,5)";
        MyRange myRange = new MyRange(input);
        assertEquals(4 , myRange.getLastNum());
    }

    @Test
    void checkResultStartandEndWithIncude(){
        String input = "[1,5]";
        MyRange myRange = new MyRange(input);
        assertEquals("1,2,3,4,5" , myRange.getResult());
    }

    @Test
    void checkResultStartandEndWithExcude(){
        String input = "(1,5)";
        MyRange myRange = new MyRange(input);
        assertEquals("2,3,4" , myRange.getResult());
    }

    @Test
    void checkResultStartWithExculdeAndEndWithInclude(){
        String input = "(1,5]";
        MyRange myRange = new MyRange(input);
        assertEquals("2,3,4,5" , myRange.getResult());
    }

    @Test
    void checkResultStartWithIncludeAndEndWithExculde(){
        String input = "[1,5)";
        MyRange myRange = new MyRange(input);
        assertEquals("1,2,3,4" , myRange.getResult());
    }
}