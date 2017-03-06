package com.ss.sorting;
/**
 * Created by Siddhesh on 3/5/2017.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input Type: \n" +
                " 1. Integer \n" +
                " 2. Double \n" +
                " 3. String");
        int inputType = sc.nextInt();
        Comparable a[] = InputHelper.readFile(inputType);
        Sorter sorter;
        System.out.println("Enter Sort Type: \n" +
                " 1. Selection Sort \n" +
                " 2. Bubble Sort \n" +
                " 3. Insertion Sort \n" +
                " 4. Merge Sort \n" +
                " 5. Quick Sort \n" +
                " 6. Heap Sort \n" +
                " 7. Counting Sort \n" +
                " 8. Radix Sort");

        int sortType = sc.nextInt();
        switch (sortType) {
            case 1: {
                sorter = new Selection(a);
                break;
            }
            case 2: {
                sorter = new Bubble(a);
                break;
            }
            case 3: {
                sorter = new Insertion(a);
                break;
            }
            default: {
                sorter = new Insertion(a);
                break;
            }
            // TO-DO : Add other sorts
        }

        sorter.sort();
        assert sorter.isSorted();
        sorter.show();
    }
}
