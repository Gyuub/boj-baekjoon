package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Description : Problem1918 문제. 후위 표기식 1
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-03
 */

public class Problem1918 {

    /**
     * 중위 표기식을 후위 표기식으로 바꾸는 방법을 간단히 설명하면 이렇다.
     * 우선 주어진 중위 표기식을 연산자의 우선순위에 따라 괄호로 묶어준다.
     * 그런 다음에 괄호 안의 연산자를 괄호의 오른쪽으로 옮겨주면 된다.
     */
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        Stack<String> stack = new Stack<>();
        String str = br.readLine();
        boolean flag = false;

        //==중위-> 후위 표기식 변환==//
        for (int i = 0; i < str.length(); i++) {
            char node = str.charAt(i);

            //==피연산자 처리==//
            if(('A') <= node && node <= ('Z')){
                sb.append(node);
            }else{
                //==연산자 우선순위 처리==//
                switch (node){
                    case '(' :
                        stack.push(String.valueOf(node)); break;
                    case ')' :
                        while(!stack.empty() && !stack.lastElement().equals("(")){
                            sb.append(stack.pop());
                        }
                        stack.pop();
                        break;
                    case '+' :
                    case '-' :
                        while(!stack.empty() && !stack.lastElement().equals("(")){
                            sb.append(stack.pop());
                        }
                        stack.push(String.valueOf(node)); break;
                    case '*' :
                    case '/' :
                        while(!stack.empty() && (stack.lastElement().equals("*") || stack.lastElement().equals("/"))){
                            sb.append(stack.pop());
                        }
                        stack.push(String.valueOf(node)); break;
                }

            }
        }
        //==남은 연산자 출력==/
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
