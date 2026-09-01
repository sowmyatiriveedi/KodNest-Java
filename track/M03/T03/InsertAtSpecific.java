package track.M03.T03;

import java.util.*;

public class InsertAtSpecific {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            int n = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            int b[] = new int[a.length + 1];
            int ele = s.nextInt();
            int pos = s.nextInt();
            for (int i = 0; i < pos; i++) {
                b[i] = a[i];
            }
            b[pos] = ele;
            for (int i = pos; i < a.length; i++) {
                b[i + 1] = a[i];
            }
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
        }
    }

}
