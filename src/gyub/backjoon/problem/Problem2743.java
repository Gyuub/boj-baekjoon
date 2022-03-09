package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Description : Problem2743 문제. 단어 길이 재기
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-05
 */
public class Problem2743 {

    /**
     * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
     *
     * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
     */
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(br.readLine().length());

    }
}
