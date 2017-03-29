package com.ss.priorityqueue;

import java.util.Arrays;

/**
 * Created by Siddhesh on 3/11/2017.
 */
public class MaxPQ {
    private Object pq[];
    private int N = 0;

    private MaxPQ(int length) {
        pq = new Object[length];
    }

    public int getSize() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    @SuppressWarnings("unchecked")
    private boolean less(int i, int j) {
        return ((Comparable) pq[i]).compareTo(pq[j]) < 0;
    }

    private void swap(int i, int j) {
        Object temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            swap(k / 2, k);
            k = k / 2;
        }
    }

    @SuppressWarnings("SameParameterValue")
    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1)) j++;
            if (!less(k, j)) break;
            swap(k, j);
            k = j;
        }
    }

    private void insert(Object o) {
        pq[++N] = o;
        swim(N);
    }

    private Object deleteMax() {
        Object del = getMax();
        swap(1, N--);
        pq[N + 1] = null;
        sink(1);
        return del;
    }

    private Object getMax() {
        return pq[1];
    }

    public void sort() {
        for (int k = N / 2; k >= 1; k--) {
            sink(k);
        }

        while (N > 1) {
            swap(1, N--);
            sink(1);
        }
    }

    public static void main(String args[]) {
        MaxPQ maxPQ = new MaxPQ(10);
        maxPQ.insert(10);
        maxPQ.insert(50);
        maxPQ.insert(20);
        maxPQ.insert(30);
        maxPQ.insert(70);
        maxPQ.insert(50);
        maxPQ.insert(80);
        maxPQ.insert(40);
        System.out.println("Heap after construction : " + Arrays.toString(maxPQ.pq));
        System.out.println("Max element : " + maxPQ.deleteMax());
        System.out.println("Heap after max removal : " + Arrays.toString(maxPQ.pq));
        System.out.println("Max element : " + maxPQ.deleteMax());
        maxPQ.insert(100);
        System.out.println("Heap after new addition : " + Arrays.toString(maxPQ.pq));

        maxPQ.sort();
        System.out.println("Heap after sort : " + Arrays.toString(maxPQ.pq));

    }
}
