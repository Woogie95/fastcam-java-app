package chapter03;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 44, 16, 32, 1, 22};

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                    arr[i] = arr[j];
                    arr[j] = max;
                }
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
