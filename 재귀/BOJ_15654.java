import java.util.Arrays;
import java.util.Scanner;

public class BOJ_15654 {
    public static int m;
    public static int n;
    public static boolean check[];
    public static int output[];
    public static int arr[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        check = new boolean[n];
        output = new int[m];

        Arrays.sort(arr);
        // 4p2 4p4 npm
        perm(0);

    }

    public static void perm(int depth) {
        // base case
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < m; i++)
        // sb.append(output[i]+" ");
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                check[i] = true;

                output[depth] = arr[i];
                perm(depth + 1);

                check[i] = false; // 다음부터 재활용 가능
            }
        }
    }
}
