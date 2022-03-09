package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Description : Problem10809 문제. 알파벳 찾기
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-04
 */
public class Problem10809 {

    /**
     * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
     * 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
     * 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String str = br.readLine();

        int [] indexArray = new int[26];
        for (int i = 0; i < indexArray.length; i++) {
            indexArray[i] = -1;
        }

        char standard = 'a';
        for (int i = 0; i < str.length(); i++) {
            char node = str.charAt(i);
            if( indexArray[node - standard] == -1){
                indexArray[node - standard] = i;
            }
        }

        for (int i = 0; i < indexArray.length; i++) {
            sb.append(indexArray[i]).append(" ");
        }
        System.out.println(sb);

    }
}
