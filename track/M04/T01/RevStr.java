package track.M04.T01;

import java.util.*;

public class RevStr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter string:");
        String a = s.next();

        char b[] = a.toCharArray();
        char c[] = new char[b.length];

        int j = c.length - 1;
        for (int i = 0; i < b.length; i++) {
            c[j] = b[i];
            j--;
        }

        String d = new String(c);
        System.out.println("original: " + a);
        System.out.println("reverse: " + d);
    }
}