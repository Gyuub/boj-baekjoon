package gyub.backjoon.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Description : 백준 10828 스택문제<br>
 * Date : 2021. 9. 1.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 9. 1., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Stack10828 {
	static StringBuffer sb = new StringBuffer();
	static Stack<Integer> stack = new Stack<Integer>();
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 명령어 갯수
		int size = Integer.parseInt(br.readLine());
		
		// 명령어 입력 처리
		for(int i = 0 ; i < size; i ++) {
			String str = br.readLine();
			order(stack , str);
		}
		
		System.out.println(sb);

	}
	
	
	/**
	 * 명령어 입력 처리
	 	push X: 정수 X를 스택에 넣는 연산이다.
		pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		size: 스택에 들어있는 정수의 개수를 출력한다.
		empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
		top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 * @param stack
	 * @param order
	 */
	public static void order(Stack<Integer> stack, String order) {
		String [] orders = order.split(" ");
		
		switch (orders[0]) {
		case "push": 
			stack.push(Integer.parseInt(orders[1]));
			break;
		case "pop":
			sb.append(stack.size() == 0 ? "-1" : stack.pop()).append("\n");
			break;
		case "size":
			sb.append(stack.size()).append("\n");
			break;
		case "empty":
			sb.append(stack.size() == 0 ? "1" : "0").append("\n");
			break;	
		case "top":
			sb.append(stack.size() == 0 ? "-1" : stack.lastElement()).append("\n");
			break;	
		}
		
				
	} 

}
