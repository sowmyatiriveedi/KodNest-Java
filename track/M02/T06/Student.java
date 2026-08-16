import java.util.Scanner;

class Main {
    String name;

    Main(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Main s = new Main(name);
        s.display();
        scanner.close();
    }
}