import java.util.*;

public class RowAdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            t = 0;
            for (int j = 0; j < a[i].length; j++) {
                t += a[i][j];
            }
            System.out.println(t);
        }
    }

}
