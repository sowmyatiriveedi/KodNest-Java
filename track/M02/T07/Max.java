package track.M02.T07;

import java.util.*;

public class Max {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max: " + max);
        s.close();
    }

}
