
public static void main(String[] args) {
    int n;
    System.out.print("enter num of elem: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    // selection sort
    for (int i = 0; i < n - 1; i++) {
        int mini = i; // consider the current element as the smallest one..
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[mini])
                mini = j;
        }
        int val = arr[i];
        arr[i] = arr[mini];
        arr[mini] = val;
    }
    for (int e : arr) {
        System.out.print(e + " ");
    }

}
