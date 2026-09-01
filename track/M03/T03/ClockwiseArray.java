package track.M03.T03;

import java.util.*;

public class ClockwiseArray {
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
                b[i + 1] = a[i];
            }
            b[0] = a[a.length - 1];
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
        }
    }

}
