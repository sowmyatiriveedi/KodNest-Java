package track.practice;

import java.util.*;

public class Square {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            int n = s.nextInt();
            for (int i = 1; i < n / 2; i++) {
                if (i * i == n) {
                    System.out.println(i);
                    break;
                }
                if (i * i > n) {
                    System.out.println((i - 1));
                    break;
                }
            }
        }
    }
}
