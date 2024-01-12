import java.util.*;

public class BOJ_1449 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int b[] = new int[n];
        int tape = 0;
        int j = 0;
        for (int i = 0; i < n - 1; i++) {

            if (a[i] - 0.5 + len >= a[i + 1]) {
                tape++;
            } else {

                b[j++] = a[i + 1];
            }
        }

        if (ans % len != 0) {
            System.out.println((ans / len) + 1);
        } else {
            System.out.println(ans / len);
        }

    }
}
