package com.ss.sorting.comparison;

import com.ss.sorting.Sorter;

/**
 * Created by Siddhesh on 3/7/2017.
 */
abstract public class CompSorter extends Sorter {
    private int ex = 0;
    private int com = 0;

    public CompSorter() {
    }

    public CompSorter(Object a[]) {
        assert a instanceof Comparable[];
        setA(a);
    }

    @SuppressWarnings("unchecked")
    Boolean less(int i, int j) {
        return less(a, i, j);
    }

    @SuppressWarnings("unchecked")
    Boolean less(Object aux[], int i, int j) {
        com++;
        return ((Comparable) aux[i]).compareTo(aux[j]) < 0;
    }

    void swap(int i, int j) {
        ex++;
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void show() {
        // Print the array, on a single line.
        super.show();
        System.out.println("Exchanges are " + ex);
        System.out.println("Compares are " + com);
    }
}
