
import java.util.*;

public static void main(String[] args) {
    int n;
    System.out.print("enter num of elem: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextint();
    }
    System.out.println();
    mergeSort(0, n - 1, arr);
    for (int e : arr) {
        System.out.print(e + " ");
    }
}

public static void mergeSort(int l, int h, int[] arr) {
    if (l >= h)
        return;
    int mid = l + (h - l) / 2;

    mergeSort(l, mid, arr);
    mergeSort(mid + 1, h, arr);
    mergeArray(arr, l, mid, h);
}

public static void mergeArray(int[] arr, int low, int mid, int high) {
    int[] left = new int[mid - low + 1], right = new int[high - mid];
    for (int i = 0; i < mid - low + 1; i++) {
        left[i] = arr[low + i];
    }
    for (int i = 0; i < high - mid; i++) {
        right[i] = arr[mid + i + 1];
    }

    int i = 0, j = 0, k = low;
    int n1 = mid - low + 1, n2 = high - mid;
    while (i < n1 && j < n2) {
        if (left[i] < right[j]) {
            arr[k++] = left[i];
            i++;
        } else {
            arr[k++] = right[j];
            j++;
        }
    }
    while (i < n1) {
        arr[k++] = left[i++];
    }
    while (j < n2) {
        arr[k++] = right[j++];
    }

}