package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description : 기초강의 1[ 문자열 뒤집기 ]<br>
 * Date : 2021. 9. 10.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 9. 10., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Problem9093 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < size; i++) {
			String [] strSplit = br.readLine().split(" ");
			for( int j = 0 ; j < strSplit.length; j++) {
				
				for(int k = strSplit[j].length()-1; k > -1; k--) {
					sb.append(strSplit[j].charAt(k));
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}