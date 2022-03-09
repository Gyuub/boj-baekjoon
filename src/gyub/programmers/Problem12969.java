package gyub.programmers;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Description : 직사각형 별찍기
 * @author hman0
 * @version 1.0.0
 * Date : 2022-03-08
 */
public class Problem12969 {

    /**
     * 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
     * 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sb.append("*");
        }
        for (int i = 0; i < M; i++) {
            System.out.println(sb);
        }

    }
}
