import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    MobilePlan() {
        planName = "Basic";
        price = 199;
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + " Price: " + price);
    }
}

public class Plan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            String planName = scanner.next();
            int price = scanner.nextInt();
            MobilePlan m = new MobilePlan();
            MobilePlan m1 = new MobilePlan(planName, price);
            m.display();
            m1.display();
            scanner.close();
        }
    }
}
