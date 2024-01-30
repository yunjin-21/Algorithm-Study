import java.util.*;

public class BOJ_6603 {
    public static int combi[] = new int[6];
    public static int arr[];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int tc = sc.nextInt();
            if (tc == 0) {
                break;
            }
            arr = new int[tc];
            for (int i = 0; i < tc; i++) {
                arr[i] = sc.nextInt();
            }
            find(0, 0);
            System.out.println();

        }
    }

    public static void find(int idx, int count) {
        //
        if (count == 6) {
            for (int i = 0; i < 6; i++) {
                System.out.print(combi[i] + " ");
            }
        }

    }

}
