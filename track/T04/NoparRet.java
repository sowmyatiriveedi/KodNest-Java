package track.T04;

public class NoparRet {
    public static void main(String[] args) {
        int r = add();
        System.out.println(r);
    }

    static int add() {
        int a = 10;
        int b = 20;
        int r = a + b;
        return r;
    }

}
