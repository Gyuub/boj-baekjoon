package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

/**
 * Description : Problem17299 문제. 오등큰수
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-01
 */
public class Problem17299 {

    /**
     * 크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오등큰수 NGF(i)를 구하려고 한다.
     *
     * Ai가 수열 A에서 등장한 횟수를 F(Ai)라고 했을 때, Ai의 오등큰수는 오른쪽에 있으면서 수열 A에서 등장한 횟수가 F(Ai)보다
     * 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 그러한 수가 없는 경우에 오등큰수는 -1이다.
     * 예를 들어, A = [1, 1, 2, 3, 4, 2, 1]인 경우 F(1) = 3, F(2) = 2, F(3) = 1, F(4) = 1이다.
     *
     * A1의 오른쪽에 있으면서 등장한 횟수가 3보다 큰 수는 없기 때문에,
     * NGF(1) = -1이다. A3의 경우에는 A7이 오른쪽에 있으면서 F(A3=2) < F(A7=1) 이기 때문에,
     * NGF(3) = 1이다. NGF(4) = 2, NGF(5) = 2, NGF(6) = 1 이다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int size = Integer.parseInt(br.readLine());

        Stack<Integer> answer = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        int [] count = new int[1000001];

        String [] list = br.readLine().split(" ");

        /**
         * 조건
         * 횟수가 커야하며, 가장 왼쪽에 있어야 함
         *
         * 횟수를 어떻게 정의할 것인가....
         *
         */

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(list[i]);
            count[num]++;
        }

        for (int i = size-1; i > -1; i--) {
            int num = Integer.parseInt(list[i]);
            if(temp.empty()){
                answer.push(-1);
                temp.push(num);
            }else{
                while( !temp.empty() && count[temp.lastElement()] <= count[num]){
                    temp.pop();
                }
                if(temp.empty()){
                    answer.push(-1);
                }else{
                    answer.push(temp.lastElement());
                }
                temp.push(num);
            }
        }

        while(!answer.empty()){
            sb.append(answer.pop()).append(" ");
        }
        System.out.println(sb);


    }
}
