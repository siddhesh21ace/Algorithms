package com.ss.sorting;

/**
 * Created by Siddhesh on 3/5/2017.
 */
/*
com.ss.sorting.Bubble Sort:
    1. Works well on sorted arrays
    2. Average case: ~N^2/2 compares and ~N^2/4 exchanges
       Worst case: ~N^2/2 compares and ~N^2/2 exchanges
       Best case: ~N^2/2 compares and 0 exchanges
*/
public class Bubble extends Sorter {

    Bubble(Comparable a[]) {
        setA(a);
    }

    @Override
    public void sort() {
        int N = getA().length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 1; j < N - i; j++) {
                if (less(j, j - 1)) {
                    swap(j, j - 1);
                }
            }
        }
    }
}
