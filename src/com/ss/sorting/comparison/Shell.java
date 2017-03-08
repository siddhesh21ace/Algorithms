package com.ss.sorting.comparison;

/**
 * Created by Siddhesh on 3/6/2017.
 */
/*
    Shell Sort:
    Extension of insertion sort that works very well with large unordered arrays.
    It allows exchanges of array entries that are far apart to produce partially
    sorted arrays that are eventually sorted by inserion sort
 */
public class Shell extends CompSorter {

    public Shell(Object a[]) {
        super(a);
    }

    @Override
    public void sort() {
        int h = 1;
        int N = a.length;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(j, j - h); j -= h) {
                    swap(j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
