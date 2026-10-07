package track.practice;

import java.util.*;

public class EleCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            int n = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            boolean f[] = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (f[i] == true) {
                    continue;
                }
                int co = 1;
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        f[j] = true;
                        co++;
                    }
                }
                System.out.println(a[i] + " " + co);

            }
        }
    }

}
