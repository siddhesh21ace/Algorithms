package com.ss.sorting.comparison;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Siddhesh on 3/7/2017.
 */
public class Quick extends CompSorter {

    public Quick(Object a[]) {
        super(a);
    }

    @Override
    public void sort() {
        Collections.shuffle(Arrays.asList(a));
        sort(0, a.length - 1);
    }

    private void sort(int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(lo, hi);
        sort(lo, j - 1);
        sort(j + 1, hi);
    }

    private int partition(int lo, int hi) {
        int i = lo, j = hi + 1;
        while (true) {
            while (less(++i, lo)) if (i == hi) break;
            while (less(lo, --j)) if (j == lo) break;
            if (i >= j) break;
            swap(i, j);
        }
        swap(lo, j);
        return j;
    }
}
