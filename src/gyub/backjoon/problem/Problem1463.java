package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Description : Problem1463 문제. 1로 만들기
 *
 * @author hman0
 * @version 1.0.0
 * Date : 2021-11-02
 */
public class Problem1463 {

    /**
     * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
     * <p>
     * X가 3으로 나누어 떨어지면, 3으로 나눈다.
     * X가 2로 나누어 떨어지면, 2로 나눈다.
     * 1을 뺀다.
     * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int temp = N;
        int cnt = 0;

        while (N != 1) {
            int num = 0;

            if (N % 2 == 0) {
                num = Math.min(N-1, N/2);
            }else if (N % 3 == 0) {
                num = N/3;
            }else{
                num = N-1;
            }

        }

        System.out.println("cnt : " + cnt);

    }

}
