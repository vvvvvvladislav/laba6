package laba6;
import java.util.Comparator;
public class sortQuick {
    static Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer obj1, Integer obj2) {
            return Integer.compare(obj1, obj2);
        }
    };
    public static void sortQuick(Comparable[] list, int lo, int hi) {

        if (lo < hi)
        {
            int p = partition(list, lo, hi);
            sortQuick(list, lo, p);
            sortQuick(list, p+1, hi);
        };

    }
    public static int partition(Comparable[] list, int lo, int hi) {
        int pivot = (int) list[(hi+lo)/2];
        int i = lo - 1;
        int j = hi + 1;
        while(true)
        {
            do {
                i++;
            } while (comparator.compare((int)list[i],pivot) < 0);

            do {
                j--;
            } while (comparator.compare((int)list[j],pivot) > 0);
            if (i>=j)
                return j;
            Comparable tmp = list[i];
            list[i] = list[j];
            list[j] = tmp;
        }
    }
    public static void main(String[] args) {
        Comparable[] a = {8,4,2,3,1,5,9,7,6,12,11,10};
        sortQuick(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

}
