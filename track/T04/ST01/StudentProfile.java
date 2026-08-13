package track.T04.ST01;

import java.util.Scanner;

class Student {
    int id;
    String name;
    int javaScore;
}

public class StudentProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            Student s1 = new Student();
            Student s2 = new Student();
            s1.id = scanner.nextInt();
            scanner.nextLine();
            s1.name = scanner.next();
            s1.javaScore = scanner.nextInt();
            s2.id = scanner.nextInt();
            scanner.nextLine();
            s2.name = scanner.next();
            s2.javaScore = scanner.nextInt();
            int a = s1.javaScore;
            int b = s2.javaScore;
            System.out.println(s1.id + " " + s1.name + " " + s1.javaScore);
            System.out.println(s2.id + " " + s2.name + " " + s2.javaScore);
            if (a > b)
                System.out.println(s1.name + " has the higher Java score.");
            else if (b > a)
                System.out.println(s2.name + " has the higher Java score.");
            else
                System.out.println("Both students have the same Java score.");
        }
    }
}