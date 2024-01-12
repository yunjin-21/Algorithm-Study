import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class BOJ_10431 {
    public static int compareStudent(int arr[]) {
        int cnt = 0;
        int sorted[] = new int[20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < i; j++) {
                if (sorted[j] > arr[i]) {
                    cnt += (i - j);
                }
                // Arrays.sort(arr);
            }
        }
        return cnt;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        int arr[] = new int[20];
        for (int i = 1; i <= tc; i++) {
            int tcNum = Integer.parseInt(br.readLine());
            for (int j = 0; j < 20; j++) {
                arr[j] = Integer.parseInt(br.readLine());
            }
            int cmpCnt = compareStudent(arr);
            bw.write(tcNum + " " + cmpCnt + "\n");

        }
        bw.close();
    }
}
