package track.M02.T05;

import java.util.Scanner;

class MethodDemo {
    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        int s = first + second;
        return s;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MethodDemo m = new MethodDemo();
        String name = scanner.next();
        int n1 = scanner.nextInt();
        String name = scanner.next();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        MethodDemo s1 = new MethodDemo();
        s1.sayHello();
        s1.greet(name);
        int a = s1.getLuckyNumber();
        System.out.println("Lucky Number: " + a);
        int b = s1.add(n1, n2);
        System.out.println("Sum: " + b);
    }
}