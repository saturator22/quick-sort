package com.codecool;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest{
    int[] arrayToSort;

    @BeforeEach
    void setup() {
        arrayToSort = new int[]{2,1,4,6,3,5,9,8,7};
    }

    @Test
    void testSort() {
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9]";

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arrayToSort);

        assertEquals(expected, Arrays.toString(arrayToSort));
    }
}
