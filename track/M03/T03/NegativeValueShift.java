package track.M03.T03;

import java.util.*;

public class NegativeValueShift {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int l = 0, r = a.length - 1, temp = 0;
        while (l < r) {
            if (a[l] < 0) {
                l++;
            } else if (a[r] >= 0) {
                r--;
            } else {
                temp = a[l];
                a[l] = a[r];
                a[r] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
