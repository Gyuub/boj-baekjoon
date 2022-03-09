package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Description : Problem10866 문제. 덱
 * @author hman0
 * @version 1.0.0
 * Date : 2021-09-28
 */
public class Problem10866 {
    /**
     * 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
     *
     * 명령은 총 여덟 가지이다.
     *
     * push_front X: 정수 X를 덱의 앞에 넣는다.
     * push_back X: 정수 X를 덱의 뒤에 넣는다.
     * pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * size: 덱에 들어있는 정수의 개수를 출력한다.
     * empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
     * front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     *
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        Deque<Integer> deque = new LinkedList<>();
        int orderSize = Integer.parseInt(br.readLine());
        for(int i = 0; i < orderSize; i++){
            String [] order = br.readLine().split(" ");
            switch (order[0]){
                case "push_front" :
                    deque.offerFirst(Integer.parseInt(order[1])); break;
                case "push_back" :
                    deque.offerLast(Integer.parseInt(order[1])); break;
                case "pop_front" :
                    sb.append(deque.isEmpty() ? "-1" : deque.pollFirst()); break;
                case "pop_back" :
                    sb.append(deque.isEmpty() ? "-1" : deque.pollLast()); break;
                case "size" :
                    sb.append(deque.size());break;
                case "empty" :
                    sb.append(deque.isEmpty() ? "1" : "0"); break;
                case "front" :
                    sb.append(deque.isEmpty() ? "-1" : deque.peekFirst()); break;
                case "back" :
                    sb.append(deque.isEmpty() ? "-1" : deque.peekLast()); break;
            }
            if(!order[0].contains("push")){
                sb.append("\n");
            }
        }
        System.out.println(sb);


    }
}
