package com.ss.sorting.comparison;

/**
 * Created by Siddhesh on 3/5/2017.
 */
/*
    Selection Sort:
    1.  Running time is insensitive to input.
    2.  Data movement is minimal
    3.  ~N exchanges
    4.  ~N^2 compares
*/
public class Selection extends CompSorter {

    public Selection(Object a[]) {
        super(a);
    }

    @Override
    public void sort() {
        int N = a.length;
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
