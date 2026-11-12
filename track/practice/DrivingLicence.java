package track.practice;

import java.util.*;

class underAge extends Exception {
    underAge() {
        super("you are too young");
    }
}

class Change {
    int a;

    void take() {
        Scanner s = new Scanner(System.in);
        System.out.println("ag");
        a = s.nextInt();
    }

    void verify() throws underAge {
        if (a < 18) {
            throw new underAge();
        } else {
            System.out.println("driving licence");
        }
    }
}

public class DrivingLicence {
    public static void main(String[] args) {
        Change c = new Change();
        c.take();
        try {
            c.verify();
        } catch (underAge e) {
            e.printStackTrace();
        }
    }
}
