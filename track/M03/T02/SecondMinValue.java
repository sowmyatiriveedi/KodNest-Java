package track.M03.T02;

import java.util.*;

public class SecondMinValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int min = a[0];
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                secondMin = min;
                min = a[i];
            } else if (a[i] < secondMin && a[i] != min) {
                secondMin = a[i];
            }
        }
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum value");
        } else {
            System.out.println(secondMin);
        }
    }

}
