import java.io.*;
import java.util.*;

public class BOJ_2748 {
    static Long[] arr = new Long[95];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }

    /*
     * arr[1]=1;
     * for (int i = 1; i <= n; i++) {
     * arr[i+1] += arr[i];
     * arr[i+2] += arr[i+1];
     * }
     */
    static long fibo(int n) {
        arr[1] = (long) 1;
        arr[2] = (long) 1;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}