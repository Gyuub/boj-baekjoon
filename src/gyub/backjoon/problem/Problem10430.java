package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Description : Problem10430 문제. 나머지
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-06
 */

public class Problem10430 {

    /**
     * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
     *
     * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
     *
     * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
     *
     * 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
     *
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        sb.append((num1+num2)%num3).append("\n");
        sb.append(((num1%num3) + (num2%num3))%num3).append("\n");
        sb.append((num1*num2)%num3).append("\n");
        sb.append(((num1%num3) * (num2%num3))%num3).append("\n");

        System.out.println(sb);
    }
}
