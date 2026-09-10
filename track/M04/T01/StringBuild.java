package track.M04.T01;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("java");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" is a programming language");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.ensureCapacity(50);
        System.err.println(sb.capacity());
        System.out.println(sb.length());
        StringBuilder sb1 = new StringBuilder("JAVA");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        sb1.ensureCapacity(100);
        System.out.println(sb1.capacity());
    }

}
