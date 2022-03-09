package gyub.programmers;



import java.util.Arrays;

/**
 * Description : x만큼 간격이 있는 n개의 숫자
 * @author hman0
 * @version 1.0.0
 * Date : 2022-03-09
 */
public class Problem12954 {
    public static void main(String[] args) throws Exception{

        System.out.println(Arrays.toString(solution(2, 5)));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }


}
