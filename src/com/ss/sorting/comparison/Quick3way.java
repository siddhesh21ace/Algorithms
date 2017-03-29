package com.ss.sorting.comparison;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Siddhesh on 3/11/2017.
 */
public class Quick3way extends Quick {
    public Quick3way(Object[] a) {
        super(a);
    }

    @Override
    public void sort() {
        Collections.shuffle(Arrays.asList(a));
        sort(0, a.length - 1);
    }

    private void sort(int lo, int hi) {
        if (hi <= lo) return;
        int lt = lo, i = lo + 1, gt = hi;
        Object v = a[lo];
        while (i <= gt) {
            int cmp = ((Comparable) a[i]).compareTo(v);
            if (cmp < 0) swap(lt++, i++);
            else if (cmp > 0) swap(gt--, i);
            else i++;
        }
        sort(lo, lt - 1);
        sort(gt + 1, hi);
    }
}
