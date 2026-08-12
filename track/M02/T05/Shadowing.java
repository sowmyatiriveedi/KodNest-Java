package track.M02.T05;

class Student {
    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name + " " + age + " " + height);
    }
}

public class Shadowing {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input("hi", 10, 5.9);
        s1.display();

    }

}
