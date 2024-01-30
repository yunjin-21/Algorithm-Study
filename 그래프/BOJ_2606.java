import java.util.*;

public class BOJ_2606 {
    static int v, e;
    static boolean visited[];
    static int graph[][];
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        e = sc.nextInt();
        graph = new int[v + 1][v + 1];
        visited = new boolean[v + 1];
        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dst = sc.nextInt();
            graph[src][dst] = 1;
            graph[dst][src] = 1;
        }
        dfs(1);
        System.out.println(cnt);
    }

    public static void dfs(int node) {
        visited[node] = true;
        for (int i = 1; i < v + 1; i++) {
            if (!visited[i] && graph[node][i] == 1) {
                cnt++;
                dfs(i);
            }
        }
    }

}
