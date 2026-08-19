import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            int a[] = new int[4];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        System.out.println("Duplicate found");
                    } else {
                        System.out.println("No duplicate found");
                    }
                }
            }

        }
    }

}
