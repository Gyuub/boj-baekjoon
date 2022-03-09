package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Description : Problem10824 문제. 네 수
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-05
 */

public class Problem10824 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            long num1 = Long.parseLong(st.nextToken().replaceAll(",","") +""+ st.nextToken().replaceAll(",",""));
            long num2 = Long.parseLong(st.nextToken().replaceAll(",","") +""+ st.nextToken().replaceAll(",",""));
            sb.append(num1+num2);
        }

        System.out.println(sb);
    }



}
