package track.T04;

public class ParRet {
    public static void main(String[] args) {
        int r = add(10, 20);
        System.out.println(r);
    }

    static int add(int a, int b) {
        int r = a + b;
        return r;
    }

}
