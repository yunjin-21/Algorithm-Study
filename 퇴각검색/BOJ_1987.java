import java.util.*;

public class BOJ_1987 {
    public static int board[][];
    public static boolean check[] = new boolean[26];
    public static int r, c;
    public static int[] dr = { -1, 0, 1, 0 };// 위 오른쪽 아래 왼쪽 (시계방향)
    public static int[] dc = { 0, 1, 0, -1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        board = new int[r][c];
        for (int i = 0; i < r; i++) {
            String line = sc.next();
            for (int j = 0; j < c; j++) {
                board[i][j] = line.charAt(j) - 'A';
            }
        }
        check[board[0][0]] = true;

        System.out.println(solve(0, 0));
    }

    // AB
    // CD
    // 인 경우에 A에서 보통 시작을 함
    // 보통 B로 가거나 C로 가는데
    //
    public static int solve(int row, int col) { // solve(0,0)
        int result = 0;
        for (int i = 0; i < 4; i++) {
            int nr = row + dr[i];
            int nc = col + dc[i];
            if (isOutOfBound(nr, nc, r, c))
                continue;
            int next = board[nr][nc];
            if (check[next])
                continue;

            check[next] = true;
            int nextResult = solve(nr, nc);
            result = Math.max(result, nextResult);

            check[next] = false; // B로 갔을때 check[d] = false check[b] = false로 만들어 줘서
            // C로 갈때
            // 다시 b d 가 체크안된상태여서 처음부터 계산할 수 있음~!
        }
        return result + 1;
    }

    public static boolean isOutOfBound(int row, int col, int boundR, int boundC) {
        return row < 0 || col < 0 || row >= boundR || col >= boundC;
    }
}
