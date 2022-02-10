package gyub.backjoon.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Description : 백준. 큐 관련 문제.<br>
 * Date : 2021. 9. 2.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 9. 2., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Queue10845 {
	static List<Integer> queue = new ArrayList<Integer>();
	static StringBuffer sb = new StringBuffer();

	/**
	 * push X: 정수 X를 큐에 넣는 연산이다.
		pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		size: 큐에 들어있는 정수의 개수를 출력한다.
		empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
		front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int orderSize = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < orderSize; i++) {
			order(br.readLine().split(" "));
		}
		System.out.println(sb);
	}
	
	public static void order(String [] command) throws InterruptedException {
		
		switch (command[0]) {
		case "push":
			queue.add(Integer.parseInt(command[1]));
			break;
		case "pop":
			sb.append(queue.isEmpty() ? "-1" : queue.remove(0)).append("\n");
			break;
		case "size":
			sb.append(queue.size()).append("\n");
			break;
		case "empty":
			sb.append(queue.isEmpty() ? "1" : "0").append("\n");
			break;
		case "front":
			sb.append(queue.isEmpty() ? "-1" : queue.get(0)).append("\n");
			break;
		case "back":
			sb.append(queue.isEmpty() ? "-1" : queue.get(queue.size()-1)).append("\n");
			break;
		}
	}

	
	
}
