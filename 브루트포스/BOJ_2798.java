import java.util.*;

public class BOJ_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int bj[] = new int[n];
        for (int i = 0; i < n; i++) {
            bj[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (bj[i] + bj[j] + bj[k] > ans && bj[i] + bj[j] + bj[k] <= m) {
                        ans = bj[i] + bj[j] + bj[k];
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
