package track.M03.T01;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int su = 0;
        double av = 0.0;
        int size = s.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            su += a[i];
        }
        av = (double) su / a.length;
        System.out.println(av);

    }

}
