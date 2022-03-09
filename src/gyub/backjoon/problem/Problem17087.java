package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Description : Problem17087 문제. 숨바꼭질 6
 *
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-16
 */
public class Problem17087 {

    /**
     * 수빈이는 동생 N명과 숨바꼭질을 하고 있다. 수빈이는 현재 점 S에 있고, 동생은 A1, A2, ..., AN에 있다.
     * <p>
     * 수빈이는 걸어서 이동을 할 수 있다. 수빈이의 위치가 X일때 걷는다면 1초 후에 X+D나 X-D로 이동할 수 있다. 수빈이의 위치0가 동생이 있는 위치와 같으면, 동생을 찾았다고 한다.
     * <p>
     * 모든 동생을 찾기위해 D의 값을 정하려고 한다. 가능한 D의 최댓값을 구해보자.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //==동생수==//
        int N = Integer.parseInt(st.nextToken());
        //==현재 수빈이의 위치==//
        long S = Long.parseLong(st.nextToken());

        long[] A = new long[N];
        st = new StringTokenizer(br.readLine());

        //==동생 좌표==//
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }

        long gcdNumber = 0;
        for (int i = 1; i < N; i++) {
            long a = Math.abs(S - A[i]);
            long b = Math.abs(S - A[i - 1]);

            if (gcdNumber == 0) {
                gcdNumber = gcd(a, b);
            } else {
                gcdNumber = gcd(gcdNumber, a);
            }
        }
        System.out.println(gcdNumber == 0 ? Math.abs(S - A[0]) : gcdNumber);

    }

    public static long gcd(long a, long b) {
        return a % b != 0 ? gcd(b, a % b) : b;
    }

}
