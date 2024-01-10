import java.io.*;
import java.util.*;

public class BOJ_3058 {

    public static String process(int[] arr) {
        Arrays.sort(arr);
        int[] brr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                brr[j++] = arr[i];
            }
        }
        int a = brr[0];
        int sum = 0;
        for (int i = 0; i < brr.length; i++) {
            sum += brr[i];
        }
        String c = Integer.toString(sum) + " " + Integer.toString(a);
        return c;

    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int arr[] = new int[7];
        while (tc-- > 0) {
            for (int i = 0; i < 7; i++) {
                arr[i] = sc.nextInt();

            }
            System.out.println(process(arr));
        }

    }
}
