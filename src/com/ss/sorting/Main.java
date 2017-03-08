package com.ss.sorting;
/**
 * Created by Siddhesh on 3/5/2017.
 */

import com.ss.sorting.comparison.*;
import com.ss.sorting.counting.Counting;

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
        Object[] a = InputHelper.readFile(inputType);
        Sorter sorter;
        System.out.println("Enter Sort Type: \n" +
                " 1. Selection Sort \n" +
                " 2. Bubble Sort \n" +
                " 3. Insertion Sort \n" +
                " 4. Shell Sort \n" +
                " 5. Merge Sort \n" +
                " 6. Bottom Up Merge Sort \n" +
                " 7. Quick Sort \n" +
                " 8. Counting Sort");

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
            case 4: {
                sorter = new Shell(a);
                break;
            }
            case 5: {
                sorter = new Merge(a);
                break;
            }
            case 6: {
                sorter = new BUMerge(a);
                break;
            }
            case 7: {
                sorter = new Quick(a);
                break;
            }
            default: {
                sorter = new Counting(a);
                break;
            }
            // TO-DO : Add other sorts
        }

        sorter.sort();
        sorter.show();
    }
}
