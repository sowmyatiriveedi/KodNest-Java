package track.M02.T07;

public class ReorderStock {
    public static void main(String[] args) {
        {
            int a[] = { 2, 45, 2, 65, 1 };
            int re = 5, r = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= re) {
                    r++;
                }
            }
            System.out.println(r);
        }
    }

}
