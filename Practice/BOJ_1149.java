import java.util.*;

public class BOJ_1149 {
    public static int a[][];
    public static int d[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        a = new int[tc + 1][3];
        d = new int[tc + 1][3];

        for (int i = 1; i < tc + 1; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            a[i][2] = sc.nextInt();

        }
        d[1][0] = a[1][0];
        d[1][1] = a[1][1];
        d[1][2] = a[1][2];
        d[2][0] = a[2][0] + Math.min(d[1][1], d[1][2]);
        d[2][1] = a[2][1] + Math.min(d[1][0], d[1][2]);
        d[2][2] = a[2][2] + Math.min(d[1][0], d[1][1]);

        for (int n = 3; n < tc + 1; n++) {
            d[n][0] = a[n][0] + Math.min(d[n - 1][1], d[n - 1][2]);
            d[n][1] = a[n][1] + Math.min(d[n - 1][0], d[n - 1][2]);
            d[n][2] = a[n][2] + Math.min(d[n - 1][0], d[n - 1][1]);
        }
        int result = Math.min(d[tc][0], d[tc][1]);
        System.out.println(Math.min(result, d[tc][2]));
    }
}
