package track.practice;

import java.util.*;

public class Route {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        int c = s.nextInt();
        // String d[]=a.split(" ");
        int j = 0, co = 0;
        for (int i = 0; i < a.length(); i = i + c) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
                j++;
                co++;
            } else {
                break;
            }

        }
        if (co == b.length()) {
            System.out.println("Valid");
        } else {
            System.out.println("NOT Valid");
        }

    }
}
