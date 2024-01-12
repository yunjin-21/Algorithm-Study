import java.util.*;

//다시ㅎㅎ
public class BOJ_2293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int coin[] = new int[n];
        int dp[] = new int[k + 1];// k+1
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
            if (coin[i] <= k) {
                // dp[coin[i]] = 1;
            }
        }

        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                if (coin[j] + i <= k && dp[coin[j]] != 0) {
                    dp[coin[j] + i] += dp[i];
                }
            }
        }
        System.out.println(dp[k]);

    }

}
