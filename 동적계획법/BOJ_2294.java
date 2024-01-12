import java.util.*;

//다시 해보기..오류..->해결
public class BOJ_2294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 동전 종류
        int k = sc.nextInt(); // 동전 총합
        int[] coin = new int[n];
        int dp[] = new int[k + 1]; // idx원이 되기위해 사용하는 동전의 최소 개수
        // dp[]값들을 이미 다 안다고 생각
        for (int i = 1; i <= k; i++) {
            dp[i] = 100001;
        }

        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
            if (coin[i] <= k) {// 동전 총합보다 같거나 작은지 확인
                dp[coin[i]] = 1;
            }
        }

        // dp[coin[a]+b] = min(dp[coin[a]+b], dp[b]+1)
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
