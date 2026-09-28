package track.MO5.Encapsulation;

class Book {
    private int pgNo;

    public void setData(int x) {
        pgNo = x;
    }

    public void getData() {
        System.out.println(pgNo);
    }
}

public class BookApp {
    public static void main(String[] args) {
        Book b = new Book();
        // b.pgNo = 100;
        b.setData(100);
        b.getData();

    }

}
