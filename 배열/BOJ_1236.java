import java.util.Scanner;

public class BOJ_1236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        char arr[][] = new char[row][col];

        for (int i = 0; i < row; i++) {
            arr[i] = sc.next().toCharArray(); // 한줄을 char 배열로 만들기
        }
        int cnt1 = 0;
        int cnt2 = 0;

        for (int r = 0; r < row; r++) {
            boolean isMatch = true;
            for (int c = 0; c < col; c++) { // 첫번째 가로줄 비교
                if (arr[r][c] == 'X') { // 첫번째 줄에 'X' 가 존재하면
                    isMatch = false;
                    break;// 바로 넘어가기
                }
            }
            if (isMatch) {
                cnt1++;
            }
        }
        /*
         * 
         * 3 5
         * XX...
         * .XX..
         * ...XX
         */

        for (int c = 0; c < col; c++) {
            boolean isMatch = true;
            for (int r = 0; r < row; r++) { // 첫번째 세로줄 비교
                if (arr[r][c] == 'X') { // 첫번째 줄에 'X' 가 존재하면
                    isMatch = false;
                    break;// 바로 넘어가기
                }
            }
            if (isMatch) {
                cnt2++;
            }
        }
        System.out.println(Math.max(row - cnt1, col - cnt2));
    }
}