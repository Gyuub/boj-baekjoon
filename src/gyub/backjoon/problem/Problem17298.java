package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Description : Problem17298 문제. 오큰수
 * @author hman0
 * @version 1.0.0
 * Date : 2021-09-30
 */
public class Problem17298 {

    /**
     *크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다.
     * Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 그러한 수가 없는 경우에 오큰수는 -1이다.
     *
     * 예를 들어,
     * A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다.
     * A = [9, 5, 4, 8]인 경우에는 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.
     */
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int size = Integer.parseInt(br.readLine());
        String [] list = br.readLine().split(" ");

        Stack<Integer> answer = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        for (int i = size-1; i > -1; i--) {
            int num = Integer.parseInt(list[i]);

            if(temp.empty()){
                answer.push(-1);
                temp.push(num);
            }else{
                while(!temp.empty() && temp.lastElement() <= num){
                    temp.pop();
                }
                if(temp.empty()){
                    answer.push(-1);
                }else{
                    answer.push(temp.lastElement());
                }


            }
        }

        while(!answer.empty()){
            sb.append(answer.pop()).append(" ");
        }
        System.out.print(sb);
    }

}
