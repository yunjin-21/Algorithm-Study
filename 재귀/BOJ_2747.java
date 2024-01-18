import java.util.Scanner;

public class BOJ_2747 {
    static int cache[] = new int[50];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fib(sc.nextInt()));
    }

    public static int fib(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }
        if (cache[n] != 0) {// 재귀말고 바로 답을 내림
            return cache[n];
        }
        cache[n] = fib(n - 1) + fib(n - 2);
        return cache[n];

    }

}
