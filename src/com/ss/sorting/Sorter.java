package com.ss.sorting;

/**
 * Created by Siddhesh on 3/5/2017.
 */
abstract class Sorter {

    private Comparable a[];
    private int ex = 0;
    private int com = 0;

    Comparable[] getA() {
        return a;
    }

    void setA(Comparable[] a) {
        this.a = a;
    }

    abstract public void sort();

    @SuppressWarnings("unchecked")
    Boolean less(int i, int j) {
        com++;
        return a[i].compareTo(a[j]) < 0;
    }

    Boolean isSorted() {
        // Test whether the array entries are in order.
        for (int i = 1; i < a.length; i++)
            if (less(i, i - 1)) return false;
        return true;
    }

    void swap(int i, int j) {
        ex++;
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    void show() { // Print the array, on a single line.
        System.out.println(this.getClass().getName());
        for (Comparable anA : a) System.out.print(anA + " ");
        System.out.println();
        System.out.println("Exchanges are " + ex);
        System.out.println("Compares are " + com);
    }

}
