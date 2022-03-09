package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Description : Problem1676 문제. 팩토리얼 0의개수
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-11
 */
public class Problem1676 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while(N >= 5){
            count += N/5;
            N = N/5;
        }
        System.out.println(count);
    }
}
