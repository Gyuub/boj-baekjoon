package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Description : Problem1212 문제. 8진수 2진수 변환
 *
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-18
 */
public class Problem1212 {

    /**
     * 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
     * <p>
     * 첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.
     * <p>
     * 314 ==> 11 001 100
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';

            //==8진수에서 2진수 변환 총 3회 반복==//
            for (int j = 2; j > -1; j--) {
                int M = (int) Math.pow(2, j);

                // 예외처리
                if (num / M == 0 && sb.length() == 0){
                    continue;
                }
                sb.append(num / M);

                if(num / M != 0) num -= M;
            }
        }

        System.out.println(sb.length() == 0 ? "0" : sb);
    }


}
