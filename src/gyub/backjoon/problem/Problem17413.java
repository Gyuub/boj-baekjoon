package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Description : Problem17413 문제. 단어 뒤집기 2
 * @author hman0
 * @version 1.0.0
 * Date : 2021-09-28
 */
public class Problem17413 {

    /**
     * 문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.
     *
     * 먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.
     *
     * 알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
     * 문자열의 시작과 끝은 공백이 아니다.
     * '<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
     * 태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다.
     * 단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다. 태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.
     *
     * ex
     *  input baekjoon online judge
     *  out noojkeab enilno egduj
     *
     *  input <problem>17413<is hardest>problem ever<end>
     *  out <problem>31471<is hardest>melborp reve<end>
     *
     *  input <int><max>2147483647<long long><max>9223372036854775807
     *  out <int><max>7463847412<long long><max>7085774586302733229
     * */
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        boolean flag = false;
        StringBuffer temp = new StringBuffer();
        String [] list = br.readLine().split("");
        //== < > 꺽새 있을경우 처리 ==//
        for (int i = 0; i < list.length; i++) {
            String str = list[i];

            //== "<" or ">" or " " 처리
            if(str.equals("<") || str.equals(">")){
                flag = !flag;
            }

            if(str.equals("<") || str.equals(">") || str.equals(" ")){
                sb.append(temp).append(str);
                temp.setLength(0);
            }else{
                if(flag){
                    sb.append(str);
                }else{
                    temp.insert(0,str);
                }
            }
        }
        sb.append(temp);
        System.out.print(sb);
    }


}