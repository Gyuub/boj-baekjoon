package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description : Problem1373 문제. 2진수 -> 8진수 변환
 *
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-16
 */
public class Problem1373 {

    /**
     * 2진수가 주어졌을 때, 8진수로 변환하는 프로그램을 작성하시오
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String str = br.readLine();
        int len = str.length();

        if (len % 3 == 1) {
            sb.append(str.charAt(0));
        }
        if (len % 3 == 2) {
            sb.append((str.charAt(0) - '0') * 2 + (str.charAt(1)-'0'));
        }
        for (int i = len % 3; i < len; i = i + 3) {
            sb.append((str.charAt(i)-'0') * 4 + (str.charAt(i + 1) - '0') * 2 + (str.charAt(i + 2)-'0'));
        }

        System.out.println(sb);
    }

}
