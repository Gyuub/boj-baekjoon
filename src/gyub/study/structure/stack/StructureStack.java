package gyub.study.structure.stack;

import java.util.Stack;

/**
 * Description :  자료구조 스택.<br>
 * Date : 2021. 8. 31.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 8. 31., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class StructureStack {
	
	public static void main(String [] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for( int i = 1 ; i < 5 ; i ++) {
			System.out.println("push : " + i);
			stack.push(i);
		}
		
		while(stack.iterator().hasNext()) {
			System.out.println("pop : " + stack.pop());
		}
	}
	
	
}
