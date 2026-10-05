package track.MO5.Encapsulation;

class Book1 {
    private int pgNo;

    public void setData(int x) {
        if (x > 0) {
            pgNo = x;
        }
    }

    public void getData() {
        System.out.println(pgNo);
    }
}

public class BookAppVer2 {
    public static void main(String[] args) {
        Book1 b = new Book1();
        // b.pgNo = 100;
        b.setData(-100);
        b.getData();

    }

}
