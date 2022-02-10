package gyub.backjoon.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Description : 숫자카드 10815.<br>
 * Date : 2021. 9. 1.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 9. 1., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Number10815 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n, m;
		n = Integer.parseInt(br.readLine());
		int [] pivot = splitToInt(br.readLine().split(" "));
		m = Integer.parseInt(br.readLine());
		int [] array = splitToInt(br.readLine().split(" "));
		
		Arrays.sort(pivot);

		for ( int i = 0 ; i < array.length ; i++){
			sb.append(Arrays.binarySearch(pivot, array[i]) > -1 ? "1" : "0").append(" ");
		} 
		
		System.out.println(sb);
	}
	
	public static int [] splitToInt(String [] strArray) {
		int [] array = new int [strArray.length];
		for(int i = 0 ; i < strArray.length; i++) {
			array[i] = Integer.parseInt(strArray[i]);
		}
		return array;
	}
	

}