import java.util.Scanner;

class Main {
    String item;
    int quantity;

    Main(String item) {
        this.item = item;
        quantity = 1;
    }

    Main(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + " Quantity: " + quantity);
    }
}

public class FoodOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            String item = scanner.nextLine();
            int quantity = scanner.nextInt();
            Main f = new Main(item);
            Main f1 = new Main(item, quantity);
            f.display();
        }
    }
}