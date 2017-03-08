package com.ss.sorting.comparison;

/**
 * Created by Siddhesh on 3/6/2017.
 */
/*
    Bottom Up Merge Sort:
        NlogN complexity with extra space complexity
        1-1 merges followed by 2-2, 4-4 and so on
 */
public class BUMerge extends Merge {

    public BUMerge(Object a[]) {
        super(a);
    }

    @Override
    public void sort() {
        int N = getA().length;
        for (int sz = 1; sz < N; sz += sz) {
            for (int lo = 0; lo < N - sz; lo += (sz + sz)) {
                merge(lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
    }
}
