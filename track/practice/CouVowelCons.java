package track.practice;

import java.util.*;

public class CouVowelCons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            String a = s.nextLine();
            int c1 = 0, c2 = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
                        || a.charAt(i) == 'u') {
                    c1++;
                } else {
                    c2++;
                }
            }
            System.out.print("vowels:" + c1 + "consonents" + c2);
        }

    }

}
