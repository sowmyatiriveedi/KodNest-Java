package track.MO5.Encapsulation;

class Parent {
    Parent() {
        System.out.println("parent class");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("child class");
    }
}

public class Supe {
    public static void main(String[] args) {
        Child c1 = new Child();
    }

}
