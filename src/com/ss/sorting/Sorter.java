package com.ss.sorting;

/**
 * Created by Siddhesh on 3/5/2017.
 */
public abstract class Sorter {

    protected Object a[];

    public Object[] getA() {
        return a;
    }

    public void setA(Object[] a) {
        this.a = a;
    }

    abstract public void sort();

    public void show() { // Print the array, on a single line.
        System.out.println(this.getClass().getName());
        for (Object anA : a) System.out.print(anA + " ");
        System.out.println();
    }

}
