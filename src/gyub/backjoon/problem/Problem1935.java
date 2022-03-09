package gyub.backjoon.problem;

import jdk.dynalink.Operation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Stack;

/**
 * Description : Problem1935 문제. 후위 표기식2
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-02
 */
public class Problem1935 {

    /**
     * 첫째 줄에 피연산자의 개수(1 ≤ N ≤ 26) 가 주어진다. 그리고 둘째 줄에는 후위 표기식이 주어진다.
     * (여기서 피연산자는 A~Z의 영대문자이며, A부터 순서대로 N개의 영대문자만이 사용되며, 길이는 100을 넘지 않는다)
     * 그리고 셋째 줄부터 N+2번째 줄까지는 각 피연산자에 대응하는 값이 주어진다.
     * 3번째 줄에는 A에 해당하는 값, 4번째 줄에는 B에 해당하는값 , 5번째 줄에는 C ...이 주어진다, 그리고 피연산자에 대응 하는 값은 100보다 작거나 같은 자연수이다.
     *
     *
     * 후위 표기식을 앞에서부터 계산했을 때, 식의 결과와 중간 결과가 -20억보다 크거나 같고, 20억보다 작거나 같은 입력만 주어진다.
     *
     * 123*+45/-
     */

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //== 입력
        int size = Integer.parseInt(br.readLine());
        String str = br.readLine();

        Stack<Double> pOper = new Stack<>();
        double [] number = new double[size];

        for( int i = 0 ; i < size; i++){
            number[i] = Integer.parseInt(br.readLine());
        }

        double result = 0;
        //== 표기식 변환
        for (int i = 0; i < str.length(); i++) {

            if (('A') <= str.charAt(i) && str.charAt(i) <= ('Z')) {
                pOper.push(number[str.charAt(i) - 65]);
            } else {
                double num1 = pOper.pop();
                double num2 = pOper.pop();
                switch (str.charAt(i)) {
                    case '+':
                        result = num2 + num1;
                        break;
                    case '-':
                        result = num2 - num1;
                        break;
                    case '*':
                        result = num2 * num1;
                        break;
                    case '/':
                        result = num2 / num1;
                        break;
                }
                pOper.push(result);
            }
        }

        System.out.printf("%.2f", pOper.pop());
    }
}
