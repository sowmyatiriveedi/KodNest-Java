package track.M02.T07;

class LinearSearch {
    void search(int arr[], int se) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == se) {
                System.out.println("Element found at index " + i);
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("Element not found");
    }
}

public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        LinearSearch l = new LinearSearch();
        l.search(a, 3);
    }
}
