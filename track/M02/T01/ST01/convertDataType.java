package track.M02.T01.ST01;

public class convertDataType {

    public static void main(String[] args) {

        double p = 10000.0, r = 6.5, t = 2, w = 72, h = 1.8;

        int m1 = 78, m2 = 84, m3 = 69, m4 = 91, m5 = 88;

        double si = p * r * t / 100.0;

        double tot = p + si;

        double bm = w / (h * h);

        int tota = m1 + m2 + m3 + m4 + m5;

        double per = tota * 100.0 / 500;

        System.out.println("Simple Interest: " + si);

        System.out.println("Total Amount: " + tot);

        System.out.println("BMI: " + bm);

        System.out.println("Total Marks: " + tota);

        System.out.println("Percentage: " + per);

    }
}