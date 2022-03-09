package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Description : Problem1158 문제. 요세푸스
 * @author hman0
 * @version 1.0.0
 * Date : 2021-09-27
 */
public class Problem1158 {

    /**
     * 요세푸스 문제는 다음과 같다.
     *
     * 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 이제 순서대로 K번째 사람을 제거한다.
     * 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다.
     * 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
     *
     * N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
     *
     * 첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)
     *
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken()); // 사람수
        int K = Integer.parseInt(st.nextToken());  // 순서 규칙 K 번째 사람 제거,\

        Queue<Integer> queue = new LinkedList<>(); // int형 queue

        // 사람수 할당
        for (int i = 1; i <= N; i++){
            queue.offer(i);
        }

        StringBuffer sb = new StringBuffer();
        sb.append("<");
        while(queue.size() != 1){
            for(int i = 1; i < K; i++){
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
    public static void test(){
        Queue<Integer> queue = new LinkedList<>(); // int형 queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        //queue.offer()
        
        queue.poll();

        System.out.println("queue = " + queue);
        
    }
}
