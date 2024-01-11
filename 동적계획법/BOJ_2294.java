import java.util.*;

//다시 해보기..오류..
public class BOJ_2294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coin = new int[n];
        int dp[] = new int[k + 1];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
            if (coin[i] <= k) {
                dp[coin[i]] = 1;
            }
        }

        // dp[]값들을 이미 다 안다
        for (int i = 1; i <= k; i++) {
            dp[i] = 100001;
        }

        // dp[coin[a]+b] = min(dp[coin[a]+b], dp(b)+1)
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                if (coin[j] + i <= k) {
                    dp[coin[j] + i] = Math.min(dp[coin[j] + i], dp[i] + 1);
                }
            }

        }
        if (dp[k] == 100001) {
            System.out.println(-1);
        } else {
            System.out.println(dp[k]);
        }
    }
}
