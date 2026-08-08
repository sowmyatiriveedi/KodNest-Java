package track.M02.TO3.ST01;

import java.util.Scanner;

public class noRangeAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int t = 0, c = 0;
            while (start <= end) {
                if (start % 2 == 0) {
                    t = t + start;
                } else {
                    c++;
                }
                start++;
            }
            System.out.println("Even sum: " + t);
            System.out.println("Odd count: " + c);
        }
        scanner.close();

    }

}
