package track.M03.T03;

import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                c++;
                continue;
            }
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < c; i++) {
            System.out.print(0 + " ");
        }
    }
}
