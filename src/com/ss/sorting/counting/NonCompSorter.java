package com.ss.sorting.counting;

import com.ss.sorting.Sorter;

/**
 * Created by Siddhesh on 3/7/2017.
 */
abstract public class NonCompSorter extends Sorter {

    public NonCompSorter() {
    }

    public NonCompSorter(Object a[]) {
        assert a instanceof Integer[];
        setA(a);
    }

    public void show() { // Print the array, on a single line.
        super.show();
    }
}
