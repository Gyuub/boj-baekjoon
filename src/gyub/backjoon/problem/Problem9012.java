package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Description : 기초강의 1[ 괄호 ]<br>
 * Date : 2021. 9. 12.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 9. 12., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Problem9012 {

	/**
	 * 입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수
	 * T가 주어진다. 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다.
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < size; i ++) {
			Stack<Character> stack = new Stack<Character>();
			String str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				
				char c = str.charAt(j);
				
				if( c == '(') {
					stack.add(c);
					
				}else if( stack.empty() ){
					stack.add(c);
					break;
					
				}else {
					stack.pop();
					
				}
				
			}
			if(stack.empty()) sb.append("YES").append("\n");
			else sb.append("NO").append("\n");
		}
		
		System.out.println(sb);
			
	}

}
