package track.T04.ST01;

import java.util.Scanner;

class Main {
    int id;
    String name;
    String department;
    double salary;
}

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            Main s1 = new Main();
            s1.id = scanner.nextInt();
            scanner.nextLine();
            s1.name = scanner.next();
            // scanner.nextLine();
            s1.department = scanner.next();
            s1.salary = scanner.nextDouble();
            Main s2;
            s2 = s1;
            s2.salary = s2.salary + 10000;
            System.out.println("Employee Profile");
            System.out.println("ID: " + s1.id);
            System.out.println("Name: " + s1.name);
            System.out.println("Department: " + s1.department);
            System.out.println("Salary: " + s1.salary);
            // System.out.println("Employee Profile");
            System.out.println("ID: " + s2.id);
            System.out.println("Name: " + s2.name);
            System.out.println("Department: " + s2.department);
            System.out.println("Salary: " + s2.salary);
        }
    }
}
