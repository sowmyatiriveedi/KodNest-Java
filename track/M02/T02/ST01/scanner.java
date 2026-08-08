package track.M02.T02.ST01;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your  full name : ");

        String name = scan.nextLine();

        System.out.println("Full name is : " + name);

        System.out.println("Enter your age : ");

        int age = scan.nextInt();

        System.out.println("Age is : " + age);
        System.out.println("Enter Height :");

        float height = scan.nextFloat();

        System.out.println("Height is : " + height);
        scan.nextLine();

        System.out.println("Enter your  full name : ");

        String fname = scan.nextLine();

        System.out.println("Full name is : " + fname);

    }

}
