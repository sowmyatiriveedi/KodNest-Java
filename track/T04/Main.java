package track.T04;

import java.util.Scanner;

class Student {
    int registrationId;
    String name;
    double attendancePercentage;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            Student s1 = new Student();
            s1.registrationId = scanner.nextInt();
            scanner.nextLine();
            s1.name = scanner.next();
            s1.attendancePercentage = scanner.nextDouble();
            Student s2 = new Student();
            s2.registrationId = scanner.nextInt();
            scanner.nextLine();
            s2.name = scanner.next();
            s2.attendancePercentage = scanner.nextDouble();
            int registrationId = scanner.nextInt();
            if (registrationId == s1.registrationId) {
                s1.attendancePercentage = scanner.nextDouble();
                System.out.println("Selected Student: " + s1.name);
                System.out.println(s1.registrationId + " " + s1.name + " " + s1.attendancePercentage + "%");
                System.out.println(s2.registrationId + " " + s2.name + " " + s2.attendancePercentage + "%");
            } else if (registrationId == s2.registrationId) {
                s2.attendancePercentage = scanner.nextDouble();
                System.out.println("Selected Student: " + s2.name);
                System.out.println(s1.registrationId + " " + s1.name + " " + s1.attendancePercentage + "%");
                System.out.println(s2.registrationId + " " + s2.name + " " + s2.attendancePercentage + "%");
            } else {
                System.out.println("Student not found.");
                System.out.println(s1.registrationId + " " + s1.name + " " + s1.attendancePercentage + "%");
                System.out.println(s2.registrationId + " " + s2.name + " " + s2.attendancePercentage + "%");
            }
            scanner.close();
        }
    }
}
