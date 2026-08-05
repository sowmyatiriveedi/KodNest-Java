package track.M02.T02.ST01;

import java.util.Scanner;

class st02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even no");
        } else {
            System.out.println("Odd no");
        }
    }
}
