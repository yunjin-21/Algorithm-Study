import java.util.Scanner;

public class BOJ_9095 {
    public static int dp[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();

            System.out.println(solve(n));
        }
    }

    public static int solve(int n) {
        dp = new int[n + 1];// 숫자를 지정하면 런타임 에러 안나옴
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        dp[4] = 7;
        for (int i = 4; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }

}
