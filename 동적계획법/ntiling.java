import java.util.*;

public class ntiling {
    public static int solution(int n) {
        int dp[] = new int[n + 1];
        // dp[n] = dp[n-2]*3 + dp[n-4]*2 + dp[n-6]*2 + 2
        dp[2] = 3;
        dp[0] = 1;
        dp[4] = 11;
        for (int i = 4; i <= n; i += 2) {
            dp[i] = 3 * dp[i - 2]; // dp[6] = 3* dp[4] dp[4] = 3* dp[2]
            for (int j = n - 4; j >= 0; j = j - 2) {
                dp[i] += dp[j] * 2; // dp[6]+=dp[2]*2 dp[6]+=dp[0]*2 dp[4]+= dp[0]*2
            }
        }
        return (dp[n]) % 1000000007;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

}
