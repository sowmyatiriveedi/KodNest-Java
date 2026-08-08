package track.M02.TO3.ST01;

import java.util.Scanner;

public class interactiveLearningProfile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            String a = s.next();
            int b = s.nextInt();
            double c = s.nextDouble();
            System.out.println("Learner: " + a);
            System.out.println("Problems solved: " + b);
            System.out.println("Assessment: " + c);
        }
        s.close();
    }
}
