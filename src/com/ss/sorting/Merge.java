package com.ss.sorting;

/**
 * Created by Siddhesh on 3/6/2017.
 */
/*
    Merge Sort:
        NlogN complexity with extra space complexity
 */
public class Merge extends Sorter {

    private Comparable aux[];

    Merge(Comparable a[]) {
        setA(a);
        aux = new Comparable[a.length];
    }

    @Override
    public void sort() {
        sort(0, getA().length - 1);
    }

    private void sort(int low, int hi) {
        if (hi <= low) return;
        int mid = (hi + low) / 2;
        sort(0, mid);
        sort(mid + 1, hi);
        merge(low, mid, hi);
    }

    @SuppressWarnings("unchecked")
    protected void merge(int low, int mid, int hi) {
        Comparable a[] = getA();
        int i = low;
        int j = mid + 1;

        System.arraycopy(a, low, aux, low, hi + 1 - low);

        for (int k = low; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (aux[j].compareTo(aux[i]) < 0) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }
}
