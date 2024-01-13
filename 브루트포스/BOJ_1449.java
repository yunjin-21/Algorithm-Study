import java.util.*;

public class BOJ_1449 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int tape = 1;
        int currentPosition = a[0];// 한곳초기화
        for (int i = 1; i < n; i++) {// i+1대신 i만사용하게 범위변경
            if (currentPosition - 0.5 + len < a[i] + 0.5) {// 2.5>=2.5 101.5 >= 101.5
                tape++;
                currentPosition = a[i];
            }

        }
        System.out.println(tape);
    }
}
