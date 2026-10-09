package track.practice;

import java.util.*;

public class CheckPalin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            String a = s.next();
            int i = 0, j = a.length() - 1;
            boolean b = true;
            while (i < j) {
                if (a.charAt(i) != a.charAt(j)) {
                    b = false;
                    break;
                }

            }
            if (!b) {
                System.out.println("not palindrome");
            } else {
                System.out.println("palindrome");
            }
        }
    }
}
