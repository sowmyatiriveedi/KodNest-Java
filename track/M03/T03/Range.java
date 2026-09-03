package track.M03.T03;

import java.util.*;

public class Range {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int l = s.nextInt(), r = s.nextInt();
        while (l <= r && r > l) {
            if (r < n) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (r >= n) {
                System.out.println("-1");
            } else {
                System.out.print(a[i] + " ");
            }
        }

    }
}
