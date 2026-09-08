package track.M04.T01;

public class StringMethod1 {
    public static void main(String[] args) {
        String s = "KodNest Technologies";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.contains("Nest"));
        System.out.println(s.contains("Waste"));
        System.out.println(s.substring(5));
        System.out.println(s.substring(5, 14));
        System.out.println(s.startsWith("Kod"));
        System.out.println(s.startsWith("Nes"));
        System.out.println(s.endsWith("ies"));
        System.out.println(s.endsWith("Tec"));
        System.out.println(s.indexOf('e'));
        System.out.println(s.indexOf('z'));
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());
        String s1 = " ja va ";
        System.out.println(s1.trim());

    }

}
