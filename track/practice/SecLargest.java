package track.practice;

import java.util.*;

public class SecLargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            int n = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            int max = a[0];
            int max2 = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (a[i] > max) {
                    max2 = max;
                    max = a[i];
                }
                if (a[i] > max2 && a[i] != max)
                    max2 = a[i];
            }
            System.out.print(max + " " + max2);

        }
    }

}
