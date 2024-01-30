import java.util.*;

public class BOJ_2758 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long dp[][] = new long[n + 1][m + 1];

            for (int k = 0; k < m + 1; k++) {
                dp[0][k] = 1; // k이하의 값들중 0개의 수 만드는 가지수
            }
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < m + 1; j++) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j / 2]; // j-1개이하의 값들중 i개의 수 만드는 가지수 + j/2개이하의 값들중 i-1개의 수를 만드는
                                                                // 가지수
                }
            }
            System.out.println(dp[n][m]);
        }

    }
}