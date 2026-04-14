
public static void main(String[] args) {
    System.out.println("hey");
    Boolean flag = true;
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1])
            flag = false;

    }
    System.out.println(flag);

}
