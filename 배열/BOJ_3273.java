import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int arr[] = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum = Integer.parseInt(br.readLine());
        int ans = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = arr.length / 2; j < cnt; j++) {
                if (sum - arr[i] == arr[j]) {
                    ans++;
                }
            }
        }
        bw.write(ans);
        bw.flush();

    }

}
