package gyub.backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Description : 보물 찾기 1026<br>
 * Date : 2021. 9. 4.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 9. 4., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Problem1026 {

	/**
	 * 첫째 줄에 N이 주어진다. 
	 * 둘째 줄에는 A에 있는 N개의 수가 순서대로 주어지고, 
	 * 셋째 줄에는 B에 있는 수가 순서대로 주어진다. N은
	 * 50보다 작거나 같은 자연수이고, A와 B의 각 원소는 100보다 작거나 같은 음이 아닌 정수이다.
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		int [] x = new int[size];
		int [] y = new int[size];
		int [] temp = new int[size];
		boolean [] check = new boolean[size];
		int sum = 0 ;
		String [] str1 = br.readLine().split(" ");
		String [] str2 = br.readLine().split(" ");
		
		for(int i = 0 ; i < size; i++ ) {
			x[i] = Integer.parseInt(str1[i]);
			y[i] = Integer.parseInt(str2[i]);
		}
		
		// 첫번 배열 정렬
		Arrays.sort(x);
		
		for(int i = size-1 ; i > -1; i --) {
			int min = 10001;
			int minKey = -1;
			for(int j = 0; j < size; j++) {
				
				if(!check[j] && min > x[i] * y[j]) {
					min = x[i] * y[j];
					minKey = j;
				}
			}
			check[minKey] = true;
			temp[minKey] = x[i];
		}
		
		for(int i = 0 ; i < size; i ++ ) {
			sum += temp[i] * y[i];
		}
		System.out.println(sum);
		
	}

}