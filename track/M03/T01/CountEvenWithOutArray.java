package track.M03.T01;

import java.util.Scanner;

public class CountEvenWithOutArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            int n = s.nextInt();
            int e = 0;
            for (int i = 0; i < n; i++) {
                int a = s.nextInt();
                if (a % 2 == 0) {
                    e++;
                }

            }
            System.out.println(e);
            System.out.println(n - e);
        }
    }
}
