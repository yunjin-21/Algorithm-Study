package 문자열;

import java.util.Scanner;

public class BOJ_1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();// nextLine은 개행문자를 기준으로 받기에 공백도 포함해서 받아옴 aaaaa // 0-4 5
        String word = sc.nextLine();// aa //0-1
        int count = 0;
        int startIndex = 0;

        while (true) {
            int findIndex = doc.indexOf(word, startIndex);
            if (findIndex < 0) {
                break;
            }
            startIndex = findIndex + word.length();
            count++;
        }
        System.out.println(count);
        /*
         * for (int i = 0; i < doc.length(); i++) {
         * boolean isMatch = true; // 이거 중요
         * for (int j = 0; j < word.length(); j++) {
         * if (i + j >= doc.length() || doc.charAt(i + j) != word.charAt(j)) {
         * isMatch = false;
         * break;
         * }
         * }
         * if (isMatch) {
         * count++;
         * i += word.length() - 1;
         * }
         * }
         * System.out.println(count);
         */
        /*
         * String replaced = doc.replace(word, "");
         * int len = doc.length() - replaced.length();
         * int count = len / word.length();
         * 
         * System.out.println(count);
         */

    }

}
