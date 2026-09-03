package track.M03.T03;

import java.util.*;

public class SepEvOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int l = 0, r = a.length - 1;
        while (l < r) {
            if (a[l] % 2 == 0) {
                l++;
            }
            if (a[r] % 2 != 0) {
                r--;
            }
            if (a[l] % 2 != 0 && a[r] % 2 == 0) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
