package gyub.backjoon.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem11726 {

    /**
     * 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < N + 1; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
        }
        System.out.println(dp[N]);
    }
}
