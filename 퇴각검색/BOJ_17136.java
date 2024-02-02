import java.util.*;

public class BOJ_17136 {
    public static int a[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = new int[11][11]; // 10*10에 0또는 1이 적혀있음
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
}
