package lv.javaguru.junit.workshop.task_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraySorterTestJUnitVersion {

    private ArraySorter arraySorter = new ArraySorter();

    @Test
    public void testCase1() {
        int[] arr = {};
        arraySorter.sort(arr);
        assertEquals(arr.length, 0);
    }

    @Test
    public void testCase2() {
        int[] arr = {1};
        arraySorter.sort(arr);
        assertEquals(arr.length, 1);
        assertEquals(arr[0], 1);
    }

    @Test
    public void testCase3() {
        int[] arr = {2, 1};
        arraySorter.sort(arr);
        assertEquals(arr.length, 2);
        assertEquals(arr[0], 1);
        assertEquals(arr[1], 2);
    }

    @Test
    public void testCase4() {
        int[] arr = {1, 2};
        arraySorter.sort(arr);
        assertEquals(arr.length, 2);
        assertEquals(arr[0], 1);
        assertEquals(arr[1], 2);
    }

}