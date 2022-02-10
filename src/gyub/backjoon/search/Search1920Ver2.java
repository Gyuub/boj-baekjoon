package gyub.backjoon.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Description : 백준, 수 찾기 문제.<br>
 * Date : 2021. 8. 31.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 8. 31., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Search1920Ver2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n, m;
		n = Integer.parseInt(br.readLine());
		int [] pivot = splitToInt(br.readLine().split(" "));
		m = Integer.parseInt(br.readLine());
		int [] array = splitToInt(br.readLine().split(" "));
		
		Arrays.sort(pivot);
		
		for(int i = 0 ; i < array.length; i++ ) {
			sb.append(Arrays.binarySearch(pivot, array[i]) > -1 ? "1": "0").append("\n");
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