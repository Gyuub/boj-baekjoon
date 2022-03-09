package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Description : Problem6588 문제. 골드바흐의 추측
 *
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-12
 */
public class Problem6588 {

    /**
     * 4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다.
     * 예를 들어 8은 3 + 5로 나타낼 수 있고, 3과 5는 모두 홀수인 소수이다. 또, 20 = 3 + 17 = 7 + 13, 42 = 5 + 37 = 11 + 31 = 13 + 29 = 19 + 23 이다.
     * <p>
     * 입력은 하나 또는 그 이상의 테스트 케이스로 이루어져 있다. 테스트 케이스의 개수는 100,000개를 넘지 않는다.
     * 각 테스트 케이스는 짝수 정수 n 하나로 이루어져 있다. (6 ≤ n ≤ 1000000)
     * 입력의 마지막 줄에는 0이 하나 주어진다.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        boolean[] list = getEratosthenes();

        String str = "";
        while ((str = br.readLine()) != null) {
            int C = Integer.parseInt(str);
            String printStr = "";
            for (int i = C; i > 1; i--) {
                if (!list[i]) continue;

                if (list[C - i]) {
                    printStr = customPrint(C - i, i, C);
                    break;
                }
            }

            if (printStr == "") {
                //sb.append(customPrint()).append("\n");
            } else {
                sb.append(printStr).append("\n");
            }
        }
        System.out.println(sb);

    }

    public static String customPrint() {
        return "Goldbach's conjecture is wrong.";
    }

    public static String customPrint(int A, int B, int C) {
        return C + " =" + " " + A + " + " + B;
    }

    public static boolean[] getEratosthenes() {
        final int SIZE = 1000001;
        boolean[] list = new boolean[SIZE];

        for (int i = 2; i < SIZE; i++) {
            list[i] = true;
        }
        for (int i = 2; i < Math.sqrt(SIZE); i++) {

            if (!list[i]) continue;

            for (int j = i * i; j < SIZE; j = j + i) {
                list[j] = false;
            }
        }

        return list;
    }
}
