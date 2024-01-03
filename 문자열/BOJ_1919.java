
import java.util.Scanner;

class BOJ_1919 {
    public static int[] getAlphabetCount(String word) {
        int countBasic[] = new int[26];
        for (int i = 0; i < word.length(); i++) {
            countBasic[word.charAt(i) - 'a']++;
        }
        return countBasic;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        int ans = 0;

        int countA[] = getAlphabetCount(first); // [2,2,2,0 ]
        int countB[] = getAlphabetCount(second);// [0,2,0,0 -- 2,2]

        for (int i = 0; i < 26; i++) {
            ans += Math.abs(countA[i] - countB[i]);
        }
        System.out.println(ans);
    }
}