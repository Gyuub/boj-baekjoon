package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Description : Problem11656 문제. 접미사(suffix) 배열
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-05
 */
public class Problem11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String str = br.readLine();
        String[] answer = new String [str.length()];
        for (int i = 1; i <= str.length(); i++) {
            answer[i-1] = str.substring(str.length()-i,str.length());
        }
        Arrays.sort(answer);

        for (int i = 0; i < answer.length; i++) {
            sb.append(answer[i]).append("\n");
        }

        System.out.println(sb);
    }
}
