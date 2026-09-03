package track.M03.T03;

import java.util.*;

public class Target {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int target = s.nextInt();
        int l = 0, r = 0, su = 0;
        for (int i = 0; i < a.length; i++) {
            su = 0;
            for (int j = i; j < a.length; j++) {
                su += a[j];
                if (su == target) {
                    l = i;
                    r = j;
                    break;
                }
            }
            if (su == target)
                break;
        }
        if (su == target) {
            System.out.println(a[l] + " " + a[r]);
        } else {
            System.out.println(-1);
        }
    }
}
