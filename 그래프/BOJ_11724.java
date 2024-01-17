import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_11724 {
    static int n, m;
    static boolean visited[];
    static int graph[][];
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int src = sc.nextInt();
            int dst = sc.nextInt();
            graph[src][dst] = 1;
            graph[dst][src] = 1;

        }
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) { // 방문하지않은 노드부터 탐색//i는 1과 3으로 끝남
                cnt++;
                // dfsRecursion(i);
                // dfs(i);
                bfs(i);
            }

        }
        System.out.println(cnt);

    }

    public static void dfsRecursion(int node) {
        visited[node] = true;// 첫탐색하는 노드를 방문했다고 표시
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && graph[node][i] == 1) {
                dfsRecursion(i);

            }
        }
    }

    public static void dfs(int node) {
        Stack<Integer> s = new Stack<>();
        s.push(node);
        visited[node] = true;
        while (!s.empty()) {
            int now = s.pop();
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && graph[now][i] == 1) {
                    s.push(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void bfs(int node) {
        Queue<Integer> s = new LinkedList();
        s.offer(node);
        visited[node] = true;
        while (!s.isEmpty()) {
            int now = s.poll();
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && graph[now][i] == 1) {
                    s.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}
