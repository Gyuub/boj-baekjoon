package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Description : Problem10872 문제. 팩토리얼
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-12
 */
public class Problem10872 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        long sum = 1;

        for (int i = 1; i <= num; i++){
            sum *= i;
        }

        System.out.print(sum);
    }
}
