package track.M02.TO3.ST01;

import java.util.Scanner;

public class personalExpences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            double income = scanner.nextDouble();
            double rent = scanner.nextDouble();
            double food = scanner.nextDouble();
            double travel = scanner.nextDouble();
            double tot = rent + food + travel;
            double rem = income - tot;
            System.out.println("Total expense: " + tot);
            System.out.println("Remaining: " + rem);
            if (rem < 0) {
                System.out.println("Status: Over budget");
            } else {
                System.out.println("Status: Within budget");
            }

            // Calculate and display the budget details

        }

        scanner.close();

    }

}
