package gyub.backjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Description :  정렬. 문자열 심화문제.<br>
 * Date : 2021. 8. 28.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 8. 28., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Sort1431 {
	/**
	 * 모든 시리얼 번호는 알파벳 대문자 (A-Z)와 숫자 (0-9)로 이루어져 있다.

		시리얼번호 A가 시리얼번호 B의 앞에 오는 경우는 다음과 같다.
		
		A와 B의 길이가 다르면, 짧은 것이 먼저 온다.
		만약 서로 길이가 같다면, A의 모든 자리수의 합과 B의 모든 자리수의 합을 비교해서 작은 합을 가지는 것이 먼저온다. (숫자인 것만 더한다)
		만약 1,2번 둘 조건으로도 비교할 수 없으면, 사전순으로 비교한다. 숫자가 알파벳보다 사전순으로 작다.
	*/
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb = new StringBuffer();
			
			
			int size = Integer.parseInt(br.readLine());
			String [] array = new String[size];
			
			for(int i = 0 ; i < size; i ++) {
				array[i] = br.readLine();
			}
			
			Arrays.sort(array , new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					if( o1.length() == o2.length()) {
						int result = sum(o1) - sum(o2);
						return result == 0 ? o1.compareTo(o2) : result;  
					}
					return o1.length() - o2.length();
				}
			});
			
			for( int i = 0; i < size; i++) {
				sb.append(array[i]).append("\n");
			}
			System.out.println(sb);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static int sum(String str) {
		int sum = 0;
		for(int i = 0 ; i < str.length(); i++) {
			if( str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				sum += str.charAt(i) - '0';
			}
		}
		return sum;
	}

	public static int sum(int num) {
		
		int sum = 0 ;
		while(num != 0) {
			sum += (num%10);
			num = num/10;
		}
		return sum;
	}

}
