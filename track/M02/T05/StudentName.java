package track.M02.T05;

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

public class StudentName {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        {
            Student s2 = new Student();
            s2.name = s1.nextLine();
            s2.setName(s2.name);
            s2.displayName();
        }
        s1.close();
    }
}