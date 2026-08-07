package track.M02.T02.ST01;

public class nesteddowhile {
    public static void main(String[] args) {
        int i = 1, j;
        do {
            j = 1;
            do {
                System.out.println(j);
                j++;
            } while (j <= 5);
            i++;
            System.out.println();
        } while (i <= 5);
    }

}
