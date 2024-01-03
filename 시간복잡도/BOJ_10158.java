
import java.util.Scanner;

// 시간 초과남..
public class BOJ_10158 {
    public static int ant(int timePeriod, int len, int loc) {
        // int currentloc = loc;
        int delta = 1;
        while (timePeriod-- > 0) {
            if (len == loc) {
                delta = -1;
            } else if (loc == 0) {
                delta = 1;
            }
            // timePeriod--;
            loc += delta;
        }
        return loc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int t = sc.nextInt();

        int timePeriodX = t % (2 * w);
        int timePeriodY = t % (2 * h);

        int currentX = ant(timePeriodX, w, p);
        int currentY = ant(timePeriodY, h, q);
        System.out.println(currentX + " " + currentY);

    }

}