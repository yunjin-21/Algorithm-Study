import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_11053 {
    public static int dp[];
    public static int n;
    public static int arr[];

    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        dp = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int tmp = 0;
        for (int i = 2; i <= n; i++) {
            tmp = Math.max(solve(i), tmp); // 최댓값찾기

        }
        System.out.println(tmp);

    }

    public static int solve(int a) {

        /*
         * for (int i = 1; i < n + 1; i++) {
         * if (dp[i] == 0) { // 원래 dp는 0으로 되어있는데
         * dp[i] = 1; // 1로 일단 만든다
         * }
         * }
         */

        if (dp[a] != 0) {
            return dp[a];
        }
        dp[a] = 1;

        for (int i = a - 1; i >= 1; i--) {
            if (arr[i] < arr[a]) {
                dp[a] = Math.max(dp[a], solve(i) + 1);
            }
        }
        return dp[a];
    }

}
