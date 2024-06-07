import java.util.*;
public class RadixSort {
    public static void main(String[] args) {
        System.out.println("Radix Sort");
        int[] input = {170, 45, 75, 90, 802, 24, 2, 66};
        radixsort(input);
        System.out.println(Arrays.toString(input));
    }

    public static void radixsort(int[] input) {
        final int RADIX=10;
        @SuppressWarnings("unchecked")
        List<Integer>[] bucket =new ArrayList[RADIX];
        for (int i=0;i<bucket.length;i++){
            bucket[i]=new ArrayList<Integer>();
        }
        boolean maxlength=false;
        int tmp=-1,placement=1;
        while(!maxlength) {
            maxlength = true;
            for (Integer i : input) {
                tmp = i / placement;
                bucket[tmp % RADIX].add(i);
                if (tmp > 0) {
                    maxlength = false;
                }
            }


            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Integer i : bucket[b]) {
                    input[a++] = i;
                }
                bucket[b].clear();
            }
            placement *= RADIX;
        }
    }
}