package track.M03.T03;

import java.util.*;

public class ArrayPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int l = 0, r = a.length - 1, c = 0;
        while (l < r) {
            if (a[l] == a[r]) {
                c++;
                l++;
                r--;
            } else {
                break;
            }
        }
        if (c == a.length / 2)
            System.out.println("Palindrome");
        else {
            System.out.println("Not a palindrome");
        }
    }
}
