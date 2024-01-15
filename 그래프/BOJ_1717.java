import java.util.*;

public class BOJ_1717 {
    public static int parent[];

    public static void union(int a, int b) {
        a = find(a);
        b = find(b);// find함수에서 if절에 걸려서 리턴됨
        if (a != b) {
            parent[b] = a; // 순서는 상관없나..
        }
    }

    public static int find(int k) {// k인덱스의 parent[k]값의 비교,find(k) = parent[k] 찾기
        if (k == parent[k]) {
            return k;
        } else {
            return parent[k] = find(parent[k]); // 암기
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        parent = new int[n + 1]; // 0~7
        for (int i = 0; i < n + 1; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int cmp = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (cmp == 0) {
                union(a, b);
            } else {
                a = find(a);
                b = find(b);
                if (a == b) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

    }
}
