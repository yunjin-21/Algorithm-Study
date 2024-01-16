import java.util.*;

public class BOJ_1043 {
    public static int parent[];

    public static void union(int a, int b) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 사람 수
        for (int i = 1; i < n + 1; i++) {
            parent[i] = sc.nextInt();
        }

        int m = sc.nextInt(); // 파티 수

        int t = sc.nextInt();// 진실을 아는 수
        int[] tDetail = new int[t];

        for (int i = 0; i < t; i++) {
            tDetail[i] = sc.nextInt(); // 진실 누구인지
        }

        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();// 파티 오는 사람 수
            int[] pDetail = new int[p];
            for (int j = 0; j < p; j++)// 파티 누가 오는지
            {
                pDetail[j] = sc.nextInt();

            }
        }

        // 문제 조건 여기까지

    }

}