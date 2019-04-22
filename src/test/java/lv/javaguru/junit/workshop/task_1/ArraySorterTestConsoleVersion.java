package lv.javaguru.junit.workshop.task_1;

public class ArraySorterTestConsoleVersion {

    // TODO refactor
    // extract ArraySorter arraySorter = new ArraySorter();
    // extract test result compare and console printing

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
    }

    public static void testCase1() {
        int[] arr = {};
        ArraySorter arraySorter = new ArraySorter();
        arraySorter.sort(arr);
        if (arr.length == 0) {
            System.out.println("TEST CASE 1 OK");
        } else {
            System.out.println("TEST CASE 1 FAIL");
        }
    }

    public static void testCase2() {
        int[] arr = {1};
        ArraySorter arraySorter = new ArraySorter();
        arraySorter.sort(arr);
        if (arr.length == 1 && arr[0] == 1) {
            System.out.println("TEST CASE 2 OK");
        } else {
            System.out.println("TEST CASE 2 FAIL");
        }
    }

    public static void testCase3() {
        int[] arr = {2, 1};
        ArraySorter arraySorter = new ArraySorter();
        arraySorter.sort(arr);
        if ((arr.length == 2) && (arr[0] == 1) && (arr[1] == 2)) {
            System.out.println("TEST CASE 3 OK");
        } else {
            System.out.println("TEST CASE 3 FAIL");
        }
    }

    public static void testCase4() {
        int[] arr = {1, 2};
        ArraySorter arraySorter = new ArraySorter();
        arraySorter.sort(arr);
        if ((arr.length == 2) && (arr[0] == 1) && (arr[1] == 2)) {
            System.out.println("TEST CASE 4 OK");
        } else {
            System.out.println("TEST CASE 4 FAIL");
        }
    }

}