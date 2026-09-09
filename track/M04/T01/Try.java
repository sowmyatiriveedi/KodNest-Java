package track.M04.T01;

public class Try {
    public static void main(String[] args) {
        String a = "java";
        // a.toUpperCase();
        System.out.println(a.toUpperCase());
        char arr[] = a.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        String s1 = new String(arr);
        System.out.println(s1);

    }

}
