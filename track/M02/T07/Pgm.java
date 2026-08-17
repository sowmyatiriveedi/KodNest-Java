package track.M02.T07;

import java.util.*;

public class Pgm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("enter the elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("orginal array elements: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int b[] = new int[a.length];
        int j = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            b[j] = a[i];
            j--;
        }
        System.out.println("reversed array elements: ");
        for (j = 0; j < b.length; j++) {
            System.out.println(b[j]);
        }
        int c[] = b;
        System.out.println("copy array elements: ");
        for (j = 0; j < c.length; j++) {
            System.out.println(c[j]);
        }
        s.close();

    }

}
