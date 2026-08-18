package track.M02.T08;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        int c = 0;
        System.out.println("Enter the array elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter the frequency to be checked");
        int f = s.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == f)
                c++;
        }
        System.out.println(c);
    }

}
