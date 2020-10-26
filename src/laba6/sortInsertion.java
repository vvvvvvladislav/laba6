package laba6;
import java.util.Comparator;
public class sortInsertion {
    public static void selectionSort(Comparable[] list) {

        Comparable hold;
        for (int i = 1; i < list.length; i++) {
            hold = list[i];
            int j = i-1;
            while (list[j].compareTo(hold) > 0)
                    {list[j+1]=list[j];
                    j--;
                    if (j==-1)
                        break;}
            list[j+1] = hold;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }

    }
    public static void main(String[] args) {
        Comparable[] a = {8,4,2,1,5,9,7,12,11,10};
        selectionSort(a);
    }
}