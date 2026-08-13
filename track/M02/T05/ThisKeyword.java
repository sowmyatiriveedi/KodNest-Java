import java.util.Scanner;

class Student {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = scanner.nextLine();
        s1.setName(s1.name);
        s1.displayName();
        scanner.close();
    }

}
