package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Description : 기초강의 1[ 스택 수열 ]<br>
 * Date : 2021. 9. 12.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 9. 12., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Problem1874 {

	/**
	 * 1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 이때, 스택에 push하는 순서는 반드시
	 * 오름차순을 지키도록 한다고 하자. 임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로
	 * push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.
	 * 
	 * 첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로
	 * 주어진다. 물론 같은 정수가 두 번 나오는 일은 없다.
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int index = 1;
		int size = Integer.parseInt(br.readLine());
		int [] input = new int [size];
		Stack<Integer> stack = new Stack<Integer>();
		
		
		// 입력 
		for(int i = 0; i < size; i++ ) {
			input[i] = Integer.parseInt(br.readLine());
		}
		
		// 출력
		for(int i = 0; i < size; i++ ) {
			int num = input[i]; 
			
			while(index <= num) {
				sb.append("+").append("\n");
				stack.add(index);
				index++;
			}
			
			if(stack.lastElement() == num) {
				sb.append("-").append("\n");
				stack.pop();
			}else {
				sb = new StringBuffer();
				sb.append("NO");
				break;
			}
		}
		System.out.println(sb);
			
	}

}
