package gyub.backjoon.function;

/**
 * Description : 백준 셀프넘버 함수 문제.<br>
 * Date : 2021. 8. 26.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 8. 26., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Function4673 {

	// 셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 예를 들어, d(75) = 75+7+5 = 87이다.
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		boolean [] check = new boolean[10001] ;
		
		for( int k = 0; k < check.length; k++) {
			if(d(k) < 10001) {
				check[d(k)] = true;
			}
		}
		
		for( int k = 1; k < check.length; k++) {
			if(!check[k]) sb.append(k).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void test(boolean [] check) {
		for( int k = 0; k < check.length; k++) {
			if(d(k) < 10001) {
				check[d(k)] = true;
				System.out.println(k);
			}
		}
	}
	
	public static void test2(boolean [] check) {
		int i = 1 ;
		while(d(i) < 10001) {
			System.out.println(i);
			check[d(i)] = true;
			i++;
		}
	}
	
	
	public static int d(int num) {
		int sum = num;
		
		while( num != 0) {
			sum = sum + (num%10);
			num = num/10;
		}
		
		return sum;
	}

}