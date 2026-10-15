package track.MO5.Encapsulation;

public class thread1 extends Thread {
    public void run() {
        System.out.println("gm");
    }
}

public class thread2 extends Thread {
    public void run() {
        System.out.println("hello");
    }
}

public class thread3 extends Thread {
    public void run() {
        System.out.println("welcome");
    }
}

public class work {
    public static void main(String args[]) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();
        t1.start();
        t2.start();
        t3.start();
    }
}