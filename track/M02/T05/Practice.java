import java.util.Scanner;

class Printer {
    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);
    }
}

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            int num = scanner.nextInt();
            scanner.nextLine();
            String word = scanner.next();
            Printer p1 = new Printer();
            p1.show(num);

            p1.show(word);
        }
    }
}