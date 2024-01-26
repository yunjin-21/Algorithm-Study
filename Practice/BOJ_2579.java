import java.util.*;

public class BOJ_2579 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score[] = new int[301]; // 인덱스 범위 오류가 나서 이렇게 바꿈..
        int dp[] = new int[301];
        for (int i = 1; i <= n; i++) {
            score[i] = sc.nextInt();
        }
        dp[0] = 0;
        dp[1] = score[1];
        dp[2] = dp[1] + score[2];
        // dp[3] = Math.max(dp[0] + score[2], dp[1]) + score[3]; // dp[1]
        // dp[4] = dp[1] + score[3] // dp[2]
        // dp[5] = dp[2] + score[4] // dp[3]
        // 규칙을 찾자찾자찾자하하
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 3] + score[i - 1], dp[i - 2]) + score[i];
        }
        System.out.println(dp[n]);
    }

}
