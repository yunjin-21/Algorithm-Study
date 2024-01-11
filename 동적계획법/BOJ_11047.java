import java.util.*;

public class BOJ_11047 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int coin[] = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (coin[i] <= k) {// 으악
                ans += k / coin[i];// 4
                k %= coin[i];
            }

        }
        System.out.println(ans);
    }
}
