import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // String ans = "";
        char[] ans = str.toCharArray();
        for (int idx = 0; idx < str.length(); idx++) {
            char cmp = str.charAt(idx);
            if ('A' <= cmp && cmp <= 'Z')
                ans[idx] = ((char) ('a' + cmp - 'A'));
            else
                ans[idx] = ((char) ('A' + cmp - 'a'));
        }
        System.out.println(ans);
    }

}