package track.M03.T03;

import java.util.*;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            int n = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            int p = s.nextInt();
            for (int i = p; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            for (int i = 0; i < a.length - 1; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }

}
