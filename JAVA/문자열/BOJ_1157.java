package 문자열;

import java.util.Scanner;

class Main {
    public static int[] getAlphabetCount(String str) {
        int count[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            } else {
                count[ch - 'A']++;
            }
        }
        return count;
    }

    public static char maxCountChar(int[] count) {
        int max = 0;
        int idx = 0;
        char execption = 'a';// 이거 중요
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];// i가 0 인경우 count[i]=4 면 max의 i값이
                idx = i; // 이렇게 쓰기
                execption = (char) (idx + 'A');
            } else if (max == count[i]) { // 이거 중요
                execption = '?';
            }
        }
        return execption;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count[] = getAlphabetCount(str); // [0, 0, 4, 0, 1, 4, ,]

        System.out.println(maxCountChar(count));

    }
}