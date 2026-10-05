package track.MO5.Encapsulation;

class Course {
    String course;
}

class Learn {
    String name;
    Course c;

    void display() {
        System.out.println(name + " " + c.course);
    }
}

public class Test {
    public static void main(String[] args) {
        Course c = new Course();
        c.course = "java";
        Learn l = new Learn();
        l.name = "sesi";
        // l.c = c;
        l.display();
    }
}
