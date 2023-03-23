package com.garibaldi.junittests;

public class BinarySearch {

    public static int search(int[] array, int number) {
        if (array == null || array.length == 0)
            return -1;

        if (array.length == 1) {
            if (array[0] == number)
                return 0;
            return -1;
        }

        int start = 0, end = array.length - 1, position = (end + start) / 2;
        while (start != position && end != position) {
            if (array[start] == number)
                return start;
            if (array[end] == number)
                return end;

            if (array[position] == number)
                return position;

            if (number < array[position])
                end = position;
            else
                start = position;
            position = (end + start) / 2;
        }
        System.out.println(number + ", " + start + ", " + position + ", " + end);

        return -1;

    }

}