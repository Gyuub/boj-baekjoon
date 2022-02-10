package gyub.programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Description : 로또의 최고 순위와 최저 순위<br>
 * Date : 2021. 8. 30.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 8. 30., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Lotto77484 {

	
	public static void main(String [] args) {
		int [] lottos = new int [6];
		int [] winNumber = new int [6];

		System.out.println(solution(lottos, winNumber));
	}
	
	public static int [] resultArray() {
		int [] array = new int [6];
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
		return array;
	}
	
	public static int [] solution(int [] lottos, int [] winNumber)  {
		int zeroCount = 0, checkCount = 0;
		int [] result = resultArray();
		// 추첨 번호 루프
		for( int i = 0 ; i < lottos.length; i++) {
			if( lottos[i] == 0 ) {
				zeroCount++;
			}else {
				// 당첨 번호 루프
				for(int j = 0 ; j < lottos.length; j++) {
					if( lottos[i] == winNumber[j]) {
						checkCount++;
					}
				}
			}
		}
		if(checkCount == 0) {
			if(checkCount+zeroCount == 0) 
				return new int[]{result[5], result[5]};
			return new int[]{result[6- (checkCount+zeroCount)], result[5]};
		}else {
			return new int[]{result[6- (checkCount+zeroCount)], result[6- (checkCount)]};
		}
	}
}
