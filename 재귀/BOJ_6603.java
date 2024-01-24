import java.util.*;

public class BOJ_6603 {
    public static int combi[] = new int[6];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int tc = sc.nextInt();
            if (tc == 0) {
                break;
            }
            int arr[] = new int[tc];
            for (int i = 0; i < tc; i++) {
                arr[i] = sc.nextInt();
            }
            find(0, 0);
            System.out.println();

        }
    }

    public static find(int [] arr , int tc){

    }

}
