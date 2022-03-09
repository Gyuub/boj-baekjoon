package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description : Problem17103 문제. 골드바흐 파티션
 * @author hman0
 * @version 1.0.0
 * Date : 2021-11-01
 */
public class Problem17103 {

    /**
     * 골드바흐의 추측: 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다.
     *
     * 짝수 N을 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 한다.
     *
     * 짝수 N이 주어졌을 때, 골드바흐 파티션의 개수를 구해보자. 두 소수의 순서만 다른 것은 같은 파티션이다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        int SIZE = 1000001;
        boolean [] list = new boolean[SIZE];
        list[0] = true;
        list[1] = true;

        for (int i = 2; i < SIZE; i++) {
            for (int j = 2; i*j < list.length; j++) {
                if(!list[i*j]) list[i*j] = true;
            }
        }

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j = 2; j <= N/2; j++) {
                if(list[j]) continue;

                if(!list[N-j]) count++;
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);

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



