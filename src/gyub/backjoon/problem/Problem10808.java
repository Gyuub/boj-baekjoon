package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description : Problem10808 문제. 알파벳 개수
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-04
 */
public class Problem10808 {

    /**
     * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int [] countArray = new int[26];
        String str = br.readLine();
        char standard = 'a';
        for (int i = 0; i < str.length(); i++) {
            char node = str.charAt(i);
            countArray[node - standard]++;
        }

        for (int i = 0; i < countArray.length; i++) {
            sb.append(countArray[i]).append(" ");
        }
        System.out.println(sb);
    }
}
