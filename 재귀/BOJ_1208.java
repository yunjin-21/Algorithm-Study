import java.util.*;

public class BOJ_1208 {
    public static List<Integer> tree[];
    public static int like[];
    public static int parent[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // tree = new ArrayList<>(n+1);
        tree = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {// 2차원 배열의 각요소 초기화 필요
            tree[i] = new ArrayList<>();
        }
        like = new int[n + 1];
        parent = new int[n + 1];

        for (int i = 1; i <= n; i++) { // 1 2 3 4 5
            parent[i] = sc.nextInt(); // -1 1 2 3 4
            if (parent[i] == -1) {
                continue;
            }
            tree[parent[i]].add(i); //
        }

        for (int i = 0; i < m; i++) {
            int employee = sc.nextInt();
            int point = sc.nextInt();
            like[employee] += point;
        }
        next(1);
        for (int i = 1; i < n + 1; i++) {
            System.out.print(like[i] + " ");
        }
    }

    public static void next(int node) {
        for (int i = 0; i < tree[node].size(); i++) {
            int child = tree[node].get(i);
            like[child] += like[node];
            next(child);
        }

    }

}
