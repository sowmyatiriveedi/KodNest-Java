package track.M02.T07;

public class ArrayMutation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        arr[0] = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
