package com.garibaldi.junittests;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class InsertionSortTest 
{
    @Test
    public void shouldSortReversedList()
    {
        int[] list = {3, 2, 1};
        InsertionSort insertionSort = new InsertionSort(list);
        insertionSort.sort();
        int[] expectedList = {1, 2, 3};
        assertArrayEquals(list, expectedList);
    }

    @Test
    public void shouldSortRandomNumberList()
    {
        int[] list = {8, 3, 1, 9, 7, 2, 4, 6, 5};
        InsertionSort insertionSort = new InsertionSort(list);
        insertionSort.sort();
        int[] expectedList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(list, expectedList);
    }

    @Test
    public void shouldKeepSortedList()
    {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        InsertionSort insertionSort = new InsertionSort(list);
        insertionSort.sort();
        int[] expectedList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(list, expectedList);
    }
}
