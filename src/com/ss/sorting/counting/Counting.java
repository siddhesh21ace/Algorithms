package com.ss.sorting.counting;

/**
 * Created by Siddhesh on 3/7/2017.
 */
/*
    Counting Sort :
    Doesn't work on comparison basis.
    This sort assumes that each of the n input elements is an integer in the range
    0 to k, for some integer k. When k = O(n), the sort runs in O(n) time.
*/
public class Counting extends NonCompSorter {

    public Counting(Object a[]) {
        super(a);
    }

    @Override
    public void sort() {
        Object[] b = new Object[a.length];
        int max = findMax();
        int c[] = new int[max + 1];
        for (int i = 0; i < c.length; i++) {
            c[i] = 0;
        }
        for (Object i : a) {
            c[(int) i] = c[(int) i] + 1;
        }
        for (int i = 1; i < c.length; i++) {
            c[i] = c[i] + c[i - 1];
        }
        for (int i = a.length - 1; i >= 0; i--) {
            b[c[(int) a[i]] - 1] = a[i];
            c[(int) a[i]] = c[(int) a[i]] - 1;
        }
        System.arraycopy(b, 0, a, 0, b.length);
    }

    private int findMax() {
        int max = (int) a[0];
        for (Object i : a) {
            if ((int) i > max) {
                max = (int) i;
            }
        }
        return max;
    }
}
