package track.practice;

import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            int n = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                boolean see = false;
                for (int k = 0; k < i; k++) {
                    if (a[i] == a[k]) {
                        see = true;
                        break;
                    }
                }
                if (see) {
                    continue;
                }
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        System.out.print(a[i] + " ");
                        break;
                    }
                }
            }

        }
    }

}
