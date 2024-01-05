import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10989 {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        // n의 개수는 1<= n <= 10000000
        int arr[] = new int[10001]; // 10 7 7 9 9 8
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++; // 77 8 99 10
        }

        for (int i = 0; i < 10001; i++) {
            while (arr[i]-- > 0) {
                bw.write(i + "\n");
            }
        }
        bw.flush();

    }

}
