import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + k) {

                arr[i] = arr[i - 1] + k;

                m++;
            }
        }
        System.out.println(m);
    }
}