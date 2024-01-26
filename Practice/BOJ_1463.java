import java.util.*;

public class BOJ_1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int dp[] = new int[x + 1];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 3;
        for (int i = 6; i <= x; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // dp[i] = min(dp[i-1],dp[i/2],dp[i/3])+1;
            /*
             * 너무 긴 나의 방법
             * int tmp1 = dp[i - 1] + 1;
             * if (i % 2 != 0 && i % 3 != 0) {
             * dp[i] = tmp1;
             * } else if (i % 2 == 0 && i % 3 != 0) {
             * dp[i] = Math.min(dp[i - 1], dp[i / 2]) + 1;
             * } else if (i % 2 != 0 && i % 3 == 0) {
             * dp[i] = Math.min(dp[i - 1], dp[i / 3]) + 1;
             * } else {
             * int tmp2 = Math.min(dp[i / 2], dp[i / 3]) + 1;
             * dp[i] = Math.min(tmp1, tmp2);
             * }
             */

        }
        System.out.println(dp[x]);

    }
}
