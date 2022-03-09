package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Description : 자료구조 느낌 물씬 나서 자료구조에 넣었음. 에디터 문제<br>
 * Date : 2021. 9. 2.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 9. 2., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Problem1406 {
	
	/**
	 * 첫째 줄에는 초기에 편집기에 입력되어 있는 문자열이 주어진다. 이 문자열은 길이가 N이고, 영어 소문자로만 이루어져 있으며, 길이는
	 * 100,000을 넘지 않는다. 둘째 줄에는 입력할 명령어의 개수를 나타내는 정수 M(1 ≤ M ≤ 500,000)이 주어진다. 셋째 줄부터
	 * M개의 줄에 걸쳐 입력할 명령어가 순서대로 주어진다. 명령어는 위의 네 가지 중 하나의 형태로만 주어진다.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		List<Character> list = new LinkedList<Character>();

		String str = br.readLine();
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		
		int cursor = str.length();
		for( int i = 0 ; i < size; i ++) {
			String orders = br.readLine();
			
			switch (orders.charAt(0)) {
				case 'L':  
					if( cursor != 0 ) cursor--;
					break;
				case 'D': 
					if( cursor != list.size() ) cursor++;
					break;
				case 'B':
					if( cursor != 0 ) {
						list.remove(cursor-1);
						cursor--;
					}  
					break;
				case 'P':
						list.add(cursor, orders.charAt(2));
						cursor++;
					break;
			}
		}
		
		for(char a : list) {
			sb.append(a);
		}
		System.out.println(sb);
	}

	// stack 자료구조로 구현해보기 21.09.27
	public static void main2(String [] args){
		/**
		 * 한 줄로 된 간단한 에디터를 구현하려고 한다. 이 편집기는 영어 소문자만을 기록할 수 있는 편집기로, 최대 600,000글자까지 입력할 수 있다.
		 이 편집기에는 '커서'라는 것이 있는데, 커서는 문장의 맨 앞(첫 번째 문자의 왼쪽), 문장의 맨 뒤(마지막 문자의 오른쪽), 또는 문장 중간 임의의 곳(모든 연속된 두 문자 사이)에 위치할 수 있다.
		 즉 길이가 L인 문자열이 현재 편집기에 입력되어 있으면, 커서가 위치할 수 있는 곳은 L+1가지 경우가 있다.
		 이 편집기가 지원하는 명령어는 다음과 같다.
		* */
	}
}
