package com.garibaldi.junittests;

import static org.junit.Assert.assertArrayEquals;

import com.garibaldi.junittests.BubbleSort;
import org.junit.Test;

public class BubbleSortTest 
{
    @Test
    public void shouldOrderReversedList()
    {
        int[] list = {3, 2, 1};
        BubbleSort bubbleSort = new BubbleSort(list);
        bubbleSort.sort();
        int[] expectedList = {1, 2, 3};
        assertArrayEquals(list, expectedList);
    }
}
