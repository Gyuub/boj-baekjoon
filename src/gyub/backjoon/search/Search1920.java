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
public class Search1920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pivotSize, arraySize;
		pivotSize = Integer.parseInt(br.readLine());
		int [] pivot = splitToInt(br.readLine().split(" "));
		arraySize = Integer.parseInt(br.readLine());
		int [] array = splitToInt(br.readLine().split(" "));
		
		Arrays.sort(pivot);
		
		printArray(solution(pivot, array));
	}
	
	
	public static int[] solution(int [] pivotArray , int [] array) {
		int [] result = new int[array.length];
		for(int i = 0 ; i < array.length; i++) {
			int num = array[i];
			int half = pivotArray.length/2;
			int start = 0, end = 0;
			if( num < pivotArray[half]) {
				start = 0; end = half;
			}else {
				start = half; end = pivotArray.length;
			}
			for( int k = start; k < end ; k++) {
				if( num == pivotArray[k]) {
					result[i] = 1; 
					break;
				} 
			}
			
		}
		return result;
	}
	
	public static int [] splitToInt(String [] strArray) {
		int [] array = new int [strArray.length];
		for(int i = 0 ; i < strArray.length; i++) {
			array[i] = Integer.parseInt(strArray[i]);
		}
		return array;
	}
	
	public static void printArray(int [] array) {
		StringBuffer sb = new StringBuffer();
		for(int node : array) {
			sb.append(node).append("\n");
		}
		System.out.println(sb);
	}

}