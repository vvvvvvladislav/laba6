package laba6;

import java.util.Arrays;

public class sortMerge {
    private static void sortMerge(int[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        sortMerge(a, lo, mid);
        sortMerge(a, mid + 1, hi);

        int[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {8,4,2,3,1,5};
        int[] b = {9,7,6,12,11,10};
        int[] ab = new int[a.length+b.length];
        System.arraycopy(a, 0, ab, 0, a.length);
        System.arraycopy(b, 0, ab, a.length, b.length);
        sortMerge(ab,0,ab.length-1);
        for (int i = 0; i < ab.length; i++) {
            System.out.print(ab[i]+" ");
        }
    }
}
