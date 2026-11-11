package track.practice;

import java.util.*;

public class RootBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            int n = s.nextInt();
            int l = 0, h = n, a = 1;
            while (l <= h) {
                int m = l + (h - l) / 2;
                if ((m * m) == n) {
                    a = m;
                    break;
                } else if ((m * m) < n) {
                    a = m;
                    l = m + 1;
                } else {
                    h = m - 1;
                }
            }
            System.out.println(a);
        }
    }

}
