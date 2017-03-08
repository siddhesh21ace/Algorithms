package com.ss.sorting.comparison;

/**
 * Created by Siddhesh on 3/5/2017.
 */
/*
    Bubble Sort:
    1. Works well on sorted arrays
    2. Average case: ~N^2/2 compares and ~N^2/4 exchanges
       Worst case: ~N^2/2 compares and ~N^2/2 exchanges
       Best case: ~N^2/2 compares and 0 exchanges
*/
public class Bubble extends CompSorter {

    public Bubble(Object a[]) {
        super(a);
    }

    @Override
    public void sort() {
        int N = a.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 1; j < N - i; j++) {
                if (less(j, j - 1)) {
                    swap(j, j - 1);
                }
            }
        }
    }
}
