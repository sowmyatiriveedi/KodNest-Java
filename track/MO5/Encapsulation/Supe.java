package track.MO5.Encapsulation;

class Parent {
    Parent(int a) {
        System.out.println("parent class");
    }
}

class Child extends Parent {
    Child() {
        super(10);
        System.out.println("child class");
    }
}

public class Supe {
    public static void main(String[] args) {
        Child c1 = new Child();
    }

}
