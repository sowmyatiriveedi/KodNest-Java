package track.M02.T07;

public class Trace {
    public static void main(String[] args) {
        int[] original = { 14, 18, 22, 26 };
        int[] snapshot = new int[original.length];
        int j = 0;
        for (int i = 0; i < original.length; i++) {
            snapshot[j] = original[i];
            j++;
        }
        int[] liveView = original;
        original[1] = 25;
        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++)
            System.out.print(original[i] + " ");
        {
        }
        System.out.println();
        System.out.print("Snapshot: ");
        for (j = 0; j < snapshot.length; j++) {
            System.out.print(snapshot[j] + " ");
        }
        System.out.println();
        System.out.print("Same object: true");
        System.out.println();
        int r = 4;
        if (r >= 0 && r < original.length) {
            System.out.print("Requested value: " + original[r]);
        } else {
            System.out.print("Index out of bounds");
        }
    }
}