package com.ss.sorting;

/**
 * Created by Siddhesh on 3/5/2017.
 */
/*
com.ss.sorting.Selection Sort:
    1.  Running time is insensitive to input.
    2.  Data movement is minimal
    3.  ~N exchanges
    4.  ~N^2 compares
*/
class Selection extends Sorter {

    Selection(Comparable a[]) {
        setA(a);
    }

    @Override
    public void sort() {
        int N = getA().length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(j, min)) {
                    min = j;
                }
            }
            swap(min, i);
        }
    }
}
