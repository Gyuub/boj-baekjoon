package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description : Problem11655 문제. ROT13
 *
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-05
 */
public class Problem11655 {

    /**
     * ROT13은 카이사르 암호의 일종으로 영어 알파벳을 13글자씩 밀어서 만든다.
     * <p>
     * 예를 들어, "Baekjoon Online Judge"를 ROT13으로 암호화하면 "Onrxwbba Bayvar Whqtr"가 된다.
     * ROT13으로 암호화한 내용을 원래 내용으로 바꾸려면 암호화한 문자열을 다시 ROT13하면 된다.
     * 앞에서 암호화한 문자열 "Onrxwbba Bayvar Whqtr"에 다시 ROT13을 적용하면 "Baekjoon Online Judge"가 된다.
     * <p>
     * ROT13은 알파벳 대문자와 소문자에만 적용할 수 있다. 알파벳이 아닌 글자는 원래 글자 그대로 남아 있어야 한다. 예를 들어, "One is 1"을 ROT13으로 암호화하면 "Bar vf 1"이 된다.
     * <p>
     * 문자열이 주어졌을 때, "ROT13"으로 암호화한 다음 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        char[] charArray = br.readLine().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char node = charArray[i];
            char firstStandard;
            char lastStandard;
            if (('A') <= node && node <= ('Z')) {
                firstStandard = 'A';
                lastStandard = 'Z';
            }else if (('a') <= node && node <= ('z')) {
                firstStandard = 'a';
                lastStandard = 'z';
            }else{
                continue;
            }

            if (node + 13 > lastStandard){
                node = (char) ((char) (node + 13 - lastStandard) + firstStandard-1);
            }else{
                node = (char) (node + 13);
            }

            charArray[i] = node;

        }
        for (char c: charArray  ) {
            sb.append(c);
        }
        System.out.println(sb);


    }
}
