import java.util.*;

public class ArraySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            t = t + a[i];
        }
        System.out.println("Total: " + t);
        s.close();

    }

}