package track.M03.T02;

import java.util.Scanner;

public class ClosedValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            int n = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            int x = s.nextInt();
            int close = a[0];
            int mindiff = Math.abs(x - a[0]);
            for (int i = 1; i < n; i++) {
                int diff = Math.abs(x - a[i]);
                if (diff < mindiff) {
                    mindiff = diff;
                    close = a[i];
                } else if (diff == mindiff) {
                    if (a[i] < close) {
                        close = a[i];
                    }
                }
            }
            System.out.println(close);
        }
    }
}