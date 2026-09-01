package track.M03.T03;

import java.util.*;

public class AntiClockArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            int n = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            int b[] = new int[a.length];
            for (int i = 0; i < a.length - 1; i++) {
                b[i] = a[i + 1];
            }
            b[a.length - 1] = a[0];
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
        }
    }

}
