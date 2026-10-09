package track.practice;

import java.util.*;

public class RevStr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            String a = s.nextLine();
            String b[] = a.split(" ");
            // StringBuilder sb = new StringBuilder(a);
            for (int i = b.length - 1; i >= 0; i--) {
                System.out.print(b[i] + " ");
            }
        }

    }

}
