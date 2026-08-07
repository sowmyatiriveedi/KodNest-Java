package track.M02.T02.ST01;

public class nestedwhile {
    public static void main(String[] args) {
        int i = 1, j;
        while (i <= 5) {
            j = 1;
            while (j <= 5) {
                System.out.println(j);
                j++;
            }
            i++;
            System.out.println();
        }
    }

}
