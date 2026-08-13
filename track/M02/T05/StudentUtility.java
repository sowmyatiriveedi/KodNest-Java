package track.M02.T05;

import java.util.Scanner;

class Main {
    int id;
    String name;
    int javaScore;
    int sqlScore;

    static void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    static void displayStudent(int a, String b) {
        System.out.println("ID: " + a);
        System.out.println("Name: " + b);
    }

    static double calculatePercentage(int a, int b) {
        double c = ((double) a + b) / 2;
        return c;
    }

    static double getPassingPercentage() {
        return 60.0;
    }
}

public class StudentUtility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            Main utility = new Main();
            utility.id = scanner.nextInt();
            scanner.nextLine();
            utility.name = scanner.nextLine();
            utility.javaScore = scanner.nextInt();
            utility.sqlScore = scanner.nextInt();
            Main.showReportTitle();
            Main.displayStudent(utility.id, utility.name);
            double c = Main.calculatePercentage(utility.javaScore, utility.sqlScore);
            double per = Main.getPassingPercentage();
            if (c >= Main.getPassingPercentage()) {
                System.out.println("Percentage: " + c);
                System.out.println("Result: PASS");
            } else {
                System.out.println("Percentage: " + c);
                System.out.println("Result: NEEDS IMPROVEMENT");
                scanner.close();
            }
        }
    }
}