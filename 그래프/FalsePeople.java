import java.util.*;

public class FalsePeople {
    static void union(int x, int y, int[] parent, boolean[] knowsTruth) {
        x = find(x, parent);
        y = find(y, parent);

        if (x == y) {
            return;
        }
        if (knowsTruth[x]) {
            parent[y] = x;
        } else if (knowsTruth[y]) {
            parent[x] = y;
        } else
            parent[x] = y; // parent[y] = x;
    }

    public static int find(int x, int[] parent) {
        if (parent[x] == -1) {
            return x;
        } else {
            return find(x, parent);
        }
    }

    public static int countGroups(int m, ArrayList<ArrayList<Integer>> party, int[] parent, boolean[] knowsTruth) {
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            //////////////////////
        }
    }

    public static int solution(int n, int m, ArrayList<Integer> truth, ArrayList<ArrayList<Integer>> party) {
        int[] parent = new int[n + 1];
        boolean[] knowsTruth = new boolean[n + 1];

        for (int i = 1; i < n + 1; i++) { // 부모를 -1로 초기화
            parent[i] = -1;
        }
        for (int i : truth) { // 진실을 아는 사람 표시
            knowsTruth[i] = true;
        }
        for (int i = 0; i < m; i++) { // 같은 파티에 가는 정점들끼리 union
            int fp = party.get(i).get(0);
            for (int p : party.get(i)) {
                union(fp, p, parent, knowsTruth); // 맨처음 배열에 맨처음 값, 맨처음 배열 한개씩, 부모 배열 , 진실 배열
            }
        }
        return countGroups(m, party, parent, knowsTruth); // 거짓말 할 수 있는 파티 수 세기

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> truth = new ArrayList<>();

        ArrayList<ArrayList<Integer>> party = new ArrayList<>();
        int n, m, init;

        n = sc.nextInt(); // 사람수
        m = sc.nextInt(); // 파티수
        init = sc.nextInt();// 진실을 아는 사람 배열.. [1]
        while (init-- > 0) {
            int p = sc.nextInt();
            truth.add(p);
        }

        for (int i = 0; i < m; i++) {
            int size = sc.nextInt(); // 한 파티에 몇명있는지 ex)2
            while (size-- > 0) {
                int x = sc.nextInt();
                party.get(i).add(x);
            }
        }
        System.out.println(solution(n, m, truth, party)); // 출력 & 연산

    }
}
