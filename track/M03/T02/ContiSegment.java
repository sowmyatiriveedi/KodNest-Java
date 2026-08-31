package track.M03.T02;

import java.util.*;

public class ContiSegment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int max = 1, f = a[0];
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] > f) {
                count++;
                f = a[i];
                if (count > max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(max);
    }

}
