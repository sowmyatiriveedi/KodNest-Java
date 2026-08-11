package track.T04.ST01;

import java.util.Scanner;

class Main {
    int id;
    String name;
    String course;
    double javaScore;
}

public class DisplayStudentObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main s1 = new Main();
        s1.id = scanner.nextInt();
        s1.name = scanner.next();
        scanner.nextLine();
        s1.course = scanner.next();
        s1.javaScore = scanner.nextDouble();
        System.out.println("Student Profile");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Java Score: " + s1.javaScore);
    }
}