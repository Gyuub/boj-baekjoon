package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Description : Problem1978 문제. 소수 찾기
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-08
 */
public class Problem1978 {

    /**
     * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
     *
     * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
     * ex)
     * in
     * 4
     * 1 3 5 7
     * out
     * 3
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(st.nextToken());

            boolean flag = true;
            for (int j = 2; j < num; j++) {
                if (num != j && num % j == 0) {
                    flag = false;
                    break;
                }
            }
            if( num != 1 && flag ){
                count++;
            }
        }
        System.out.println(count);


    }
}
