package track.M02.TO3.ST01;
import java.util.Scanner;
public class inputconditionloop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
        System.out.println("Enter the number of days: ");
        int days = scanner.nextInt();
        int i, t = 0;
        for (i = 1; i <= days; i++) {
            System.out.println("Enter the number of problems solved on day " + i + ": ");
            int nextDay = scanner.nextInt();
            t = t + nextDay;
        }
        System.out.println("Total solved: " + t);
        if (t >= 20) {
            System.out.println("Status: Strong progress");
        } else if (t >= 10 && t <= 19) {
            System.out.println("Status: Keep improving");
        } else if (t < 10) {
            System.out.println("Status: Needs more practice");
        }
    }
        scanner.close();
    }
}
