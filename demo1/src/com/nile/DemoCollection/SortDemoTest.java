package com.nile.DemoCollection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortDemoTest {
    SortDemo mySort = new SortDemo();

    @Test
    void ListWithNoValue(){
        List<Integer> myList = new ArrayList<>();
        mySort.sort(myList);
        assertEquals(myList , mySort.sort(myList));
    }

    @Test
    void ListWithOneValue(){
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        mySort.sort(myList);
        assertEquals(myList , mySort.sort(myList));
    }

    @Test
    void ListWithTwoValueAndSorted(){
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2));
        assertEquals(myList , mySort.sort(myList));
    }

    @Test
    void ListWithTwoValueAndUnSorted(){
        List<Integer> myList = new ArrayList<>(Arrays.asList(2,1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2));
        assertEquals(expected , mySort.sort(myList));
    }

    @Test
    void ListWithThreeValueAndSorted(){
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3));
        assertEquals(expected , mySort.sort(myList));
    }

    @Test
    void ListWithThreeValueAndUnSorted1(){
        List<Integer> myList = new ArrayList<>(Arrays.asList(2,3,1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3));
        assertEquals(expected , mySort.sort(myList));
    }

    @Test
    void ListWithThreeValueAndUnSorted2(){
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,3,2));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3));
        assertEquals(expected , mySort.sort(myList));
    }

    @Test
    void ListWithThreeValueAndUnSorted3(){
        List<Integer> myList = new ArrayList<>(Arrays.asList(3,2,1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3));
        assertEquals(expected , mySort.sort(myList));
    }

    @Test
    void ListWithManyValueAndUnSorted(){
        List<Integer> myList = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        assertEquals(expected , mySort.sort(myList));
    }

}