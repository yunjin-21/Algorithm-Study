import java.util.*;

public class BOJ_1182 {
    public static int s;
    public static int n;
    public static int arr[];
    public static int ans = 0; // 아무것도 안뽑는 경우도 포함됨

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        find(0, 0);

        System.out.println(ans);
    }

    public static void find(int index, int sum) {
        if (index == n)
            return;

        if (s == sum + arr[index]) { // 이 인덱스를 포함한 값이 s랑 같으면 그냥 증가, 0인 경우를 바로 제외시킴
            ans++;
        }
        // 현재 인덱스를 포함시킬경우
        find(index + 1, sum + arr[index]);
        // 현재 인덱스 안포함시키는경우
        find(index + 1, sum);
    }
}
// 1 2 3
// g(0,0)
// g(1,0)g(1,1)
// g(2,0)g(2,1)g(2,2)g(2,3)
// g(3,0)g(3,1)g(3,2)g(3,3)g(3,3)g(3,4)g(3,5)g(3,6)