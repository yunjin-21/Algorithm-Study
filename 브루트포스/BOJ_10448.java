import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10448 {
    public static int process(int k, int arr[]) {
        boolean flag = true;
        int ans = 4;
        for (int i = 1; i < 46; i++) {
            for (int j = 1; j < 46; j++) {
                for (int r = 1; r < 46; r++) {
                    if (arr[i] + arr[j] + arr[r] == k) {
                        flag = false;
                        ans = 1;
                    }
                }
            }
        }
        if (flag) {
            ans = 0;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        int arr[] = new int[46];
        for (int i = 1; i < 46; i++) {
            arr[i] = i * (i + 1) / 2;
        }
        while (tc-- > 0) {
            int k = Integer.parseInt(br.readLine());

            bw.write(process(k, arr) + "\n");
        }
        bw.close();
    }
}