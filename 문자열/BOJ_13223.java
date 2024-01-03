
import java.util.Scanner;

public class BOJ_13223 {
    public static int calc(String input) {
        String inputArr[] = input.split(":");
        int h = Integer.parseInt(inputArr[0]);
        int m = Integer.parseInt(inputArr[1]);
        int s = Integer.parseInt(inputArr[2]);
        int total = h * 3600 + m * 60 + s;
        return total;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        int firstSalt = calc(input1);
        int lastSalt = calc(input2);

        int duringSalt = lastSalt - firstSalt;
        if (duringSalt <= 0) {
            duringSalt += 3600 * 24;
        }

        System.out.printf("%02d:%02d:%02d", duringSalt / 3600, (duringSalt % 3600) / 60, duringSalt % 60);
    }

}
