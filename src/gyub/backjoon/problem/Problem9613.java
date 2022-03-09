package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Description : Problem9613 문제. GCD 합
 *
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-15
 */
public class Problem9613 {

    /**
     * 양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성하시오.
     * <p>
     * 첫째 줄에 테스트 케이스의 개수 t (1 ≤ t ≤ 100)이 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있다.
     * 각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)가 주어지고, 다음에는 n개의 수가 주어진다. 입력으로 주어지는 수는 1,000,000을 넘지 않는다.
     * INPUT
     * 3
     * 4 10 20 30 40
     * 3 7 5 12
     * 3 125 15 25
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int t = Integer.parseInt(br.readLine());
        String[] str = new String[t];

        //==테스트케이스 사이즈==//
        for (int i = 0; i < t; i++) {
            str = br.readLine().split(" ");

            long gcdNumber = 0;
            //==케이스 수==//
            for (int j = 1; j < str.length-1; j++) {
                for (int k = j+1; k < str.length; k++) {
                    int A = Integer.parseInt(str[j]);
                    int B = Integer.parseInt(str[k]);

                    gcdNumber += gcd(A, B);
                }
            }
            sb.append(gcdNumber).append("\n");
        }
        System.out.println(sb);

    }

    public static int gcd(int a, int b) {
        return a % b != 0 ? gcd(b, a % b) : b;
    }


}
