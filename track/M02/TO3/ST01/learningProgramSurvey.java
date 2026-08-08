package track.M02.TO3.ST01;

import java.util.Scanner;

public class learningProgramSurvey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            String name = scanner.nextLine();
            int days = scanner.nextInt();
            int t = 0;
            for (int i = 1; i <= days; i++) {
                int c = scanner.nextInt();
                t = t + c;
            }
            double avg = t / days;
            System.out.println("Learner: " + name);
            System.out.println("Total solved: " + t);
            System.out.println("Daily average: " + avg);
            if (avg >= 5.0) {
                System.out.println("Status: Consistent");
            } else {
                System.out.println("Status: Needs consistency");
            }

            // Read the learner details

            // Calculate and display the progress summary
            scanner.close();

        }

    }
}
