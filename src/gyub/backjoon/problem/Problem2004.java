package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Description : Problem2004 문제. 조합 0의 개수
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-14
 */
public class Problem2004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.valueOf(st.nextToken());
        long M = Long.valueOf(st.nextToken());

        int [] molecules = new int [2];
        int [] denominator = new int [2];

        solution(molecules, N, 5);
        solution(molecules, N, 2);
        solution(denominator, M, 5);
        solution(denominator, M, 2);
        solution(denominator, N-M, 5);
        solution(denominator, N-M, 2);


        if( (molecules[0] - denominator[0]) > (molecules[1] - denominator[1])){
            System.out.println(molecules[1] - denominator[1]);
        }else{
            System.out.println(molecules[0] - denominator[0]);
        }
    }


    static void solution(int [] array, long num, int criteria){
        if( criteria == 5){
            while(num >= criteria){
                array[0] += num/criteria;
                num = num/criteria;
            }
        }else{
            while(num >= criteria){
                array[1] += num/criteria;
                num = num/criteria;
            }
        }

    }

}
