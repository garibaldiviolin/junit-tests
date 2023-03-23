package com.garibaldi.junittests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void shouldFindAllArrayElements() {
        int[] array = {15, 16, 17, 18, 19, 20};
        for (int expectedPosition = 0; expectedPosition < array.length; expectedPosition++) {
            int number = array[expectedPosition];
            int position = BinarySearch.search(array, number);
            assertTrue(position == expectedPosition);
        }
    }

    @Test
    public void shouldFindSingleArrayElement() {
        int[] array = {15};
        int position = BinarySearch.search(array, 15);
        assertTrue(position == 0);
    }

    @Test
    public void shouldNotFindSingleArrayElement() {
        int[] array = {15};
        int position = BinarySearch.search(array, 61);
        assertTrue(position == -1);
    }

    @Test
    public void shouldNotFindEmptyArrayElement() {
        int[] array = {};
        int position = BinarySearch.search(array, 201);
        assertTrue(position == -1);
    }

    @Test
    public void shouldNotFindǸullArrayElement() {
        int[] array = null;
        int position = BinarySearch.search(array, 201);
        assertTrue(position == -1);
    }

    @Test
    public void shouldNotFindSmallerElement() {
        int[] array = {15, 16, 17, 18, 19, 20};
        int position = BinarySearch.search(array, 14);
        assertTrue(position == -1);
    }

    @Test
    public void shouldNotFindBiggerElement() {
        int[] array = {15, 16, 17, 18, 19, 20};
        int position = BinarySearch.search(array, 21);
        assertTrue(position == -1);
    }

}