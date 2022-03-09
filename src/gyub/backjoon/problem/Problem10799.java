package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Description : Problem10799 문제. 쇠막대기
 * @author hman0
 * @version 1.0.0
 * Date : 2021-09-28
 */
public class Problem10799 {
    /**
     * 여러 개의 쇠막대기를 레이저로 절단하려고 한다. 효율적인 작업을 위해서 쇠막대기를 아래에서 위로 겹쳐 놓고,
     * 레이저를 위에서 수직으로 발사하여 쇠막대기들을 자른다. 쇠막대기와 레이저의 배치는 다음 조건을 만족한다.
     *
     * 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓일 수 있다. - 쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되, 끝점은 겹치지 않도록 놓는다.
     * 각 쇠막대기를 자르는 레이저는 적어도 하나 존재한다.
     * 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않는다.
     *
     * 레이저는 여는 괄호와 닫는 괄호의 인접한 쌍 ‘( ) ’ 으로 표현된다. 또한, 모든 ‘( ) ’는 반드시 레이저를 표현한다.
     * 쇠막대기의 왼쪽 끝은 여는 괄호 ‘ ( ’ 로, 오른쪽 끝은 닫힌 괄호 ‘) ’ 로 표현된다.
     * ex)
     *  input O ( ( ( O O )( O ) O ) ) ( O )
     *  output 17
     *
     * */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<String>();
        String [] list = br.readLine().split("");
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            String str = list[i];

            if(str.equals("(")){ // 왼쪽벽
                stack.push("(");
            }else{
                if(list[i-1].equals("(")){ // 레이저일경우
                    stack.pop();
                    sum += stack.size();
                }else{  //오른쪽 벽
                    stack.pop();
                    sum++;
                }
            }
        }

        System.out.println(sum);
        
    }
}
