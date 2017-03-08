package com.ss.sorting.comparison;

/**
 * Created by Siddhesh on 3/5/2017.
 */
/*
    Insertion Sort:
    1. Works well on partially sorted arrays
    2. Average case: ~N^2/4 compares and ~N^2/4 exchanges
       Worst case: ~N^2/2 compares and ~N^2/2 exchanges
       Best case: ~N-1 compares and 0 exchanges
*/
public class Insertion extends CompSorter {
    public Insertion(Object a[]) {
        super(a);
    }

    @Override
    public void sort() {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(j, j - 1); j--) {
                swap(j, j - 1);
            }
        }
    }
}
