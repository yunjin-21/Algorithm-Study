import java.util.*;;

public class BOJ_12852 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[][] = new int[n + 1][2];
        dp[1][0] = 0; // n에서 1로가는 최소 개수
        dp[1][1] = 0; // 뭐를 저장하는거지? = n에서 1빼는지 2나누는지 3나누는지 확인하는 값

        for (int i = 2; i <= n; i++) {
            dp[i][0] = dp[i - 1][0] + 1;
            dp[i][1] = i - 1;

            if (i % 2 == 0 && dp[i][0] > dp[i / 2][0] + 1) {
                dp[i][0] = dp[i / 2][0] + 1;
                dp[i][1] = i / 2;
            }

            if (i % 3 == 0 && dp[i][0] > dp[i / 3][0] + 1) {
                dp[i][0] = dp[i / 3][0] + 1;
                dp[i][1] = i / 3;
            }
        }

        System.out.println(dp[n][0]);

        while (n != 1) {
            System.out.print(n + " ");
            n = dp[n][1];
        }
        System.out.print(1);
    }
}
