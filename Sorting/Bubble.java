import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        int n;
        System.out.print("enter num of elem: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // bubble sort;

        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
        fun(arr, n);
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    public static void fun(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int v = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = v;
                }
            }
        }

    }
}
