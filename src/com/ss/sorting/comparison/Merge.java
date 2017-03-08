package com.ss.sorting.comparison;

/**
 * Created by Siddhesh on 3/6/2017.
 */
/*
    Merge Sort:
        NlogN complexity with extra space complexity
 */
public class Merge extends CompSorter {

    private Comparable aux[];

    public Merge(Object a[]) {
        super(a);
        aux = new Comparable[a.length];
    }

    @Override
    public void sort() {
        sort(0, getA().length - 1);
    }

    private void sort(int lo, int hi) {
        if (hi <= lo) return;
        int mid = (hi + lo) / 2;
        sort(lo, mid);
        sort(mid + 1, hi);
        merge(lo, mid, hi);
    }

    @SuppressWarnings("unchecked")
    void merge(int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;

        System.arraycopy(a, lo, aux, lo, hi + 1 - lo);

        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux, j, i)) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }
}
