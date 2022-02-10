package gyub.backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Description : 문제 10867.<br>
 * Date : 2021. 9. 4.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 9. 4., 설명 : 최초작성<br>
 * 
 * @author Hman
 * @version 1.0
 */
public class Problem10867 {
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main (String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int size = Integer.parseInt(br.readLine());
		String [] str = br.readLine().split(" ");
		int [] array = new int [size];
		
		for(int i = 0 ; i < size; i ++) {
			array[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(array);
		
		sb.append(String.valueOf(array[0])).append(" ");
		for(int i = 1 ; i < size; i++) {
			if( array[i] != array[i-1] ) {
				sb.append(String.valueOf(array[i])).append(" ");
			} 
		}
		System.out.println(sb);;
			
	}

}