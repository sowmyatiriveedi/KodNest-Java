package track.MO5.Encapsulation;

import java.util.*;

class Student {
    int roll;
    String name;

    @Override
    public boolean equals(Object obj) {
        Student m = (Student) obj;
        if (this.roll == m.roll && this.name.equals(m.name)) {
            return true;
        } else {
            return false;
        }

    }

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println(this.roll);
        System.out.println(this.name);
    }
}

public class ObjEqual {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            /*
             * int roll = s.nextInt();
             * s.nextLine();
             * String name = s.next();
             */
            Student s1 = new Student(11, "sai");
            Student s2 = new Student(12, "sri");
            Student s3 = new Student(11, "sai");
            s1.display();
            s2.display();
            s3.display();
            System.out.println(s1.equals(s2));
            System.out.println(s1.equals(s3));

        }

    }
}
