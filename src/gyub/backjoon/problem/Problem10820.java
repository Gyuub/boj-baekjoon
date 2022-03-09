package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description : Problem10820 문제. 문자열 분석
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-05
 */
public class Problem10820 {

    /**
     * 문자열 N개가 주어진다. 이때, 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오.
     *
     * 각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] answer;
        String str = "";
        while((str = br.readLine()) != null) {
            StringBuffer sb = new StringBuffer();
            answer = new int[4];
            for (int i = 0; i < str.length(); i++) {
                char node = str.charAt(i);
                if (('A') <= node && node <= ('Z')) {
                    answer[1]++;
                } else if (('a') <= node && node <= ('z')) {
                    answer[0]++;
                } else if (('0') <= node && node <= ('9')) {
                    answer[2]++;
                }else{
                    answer[3]++;
                }
            }

            for (int i :answer) {
                sb.append(i).append(" ");
            }
            System.out.println(sb);
        }



    }
}

