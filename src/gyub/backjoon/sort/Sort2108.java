package gyub.backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Description : 정렬. 통계학 마지막문제!! 정답률일 제일 낮아 마지막에 풀게 되었음.<br>
 * Date : 2021. 8. 30.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 8. 30., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Sort2108 {
	
	/**
	 * 첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
		둘째 줄에는 중앙값을 출력한다.
		셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
		넷째 줄에는 범위를 출력한다.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int size = Integer.parseInt(br.readLine());
		int [] array = new int [size];
		int [] count = new int [8001];
		
		int sum = 0 ;
		for(int i = 0 ; i < size; i++) {
			int num = Integer.parseInt(br.readLine());
			array[i] = num;
			count[num + 4000]++;
			
			sum+=num;
		}
		Arrays.sort(array);
		System.out.println(Math.round((sum / (double)size)));
		System.out.println(mid(array));
		System.out.println(mode(count));
		System.out.println(range(array));
		
	}
	
	public static int avg(int [] array) {
		int sum = 0 ;
		for(int num : array) 
			sum += num;
		return (int) Math.round((sum / (double)array.length)); 
	}
	
	public static int mid(int [] array) {
		return array.length == 1 ? array[0] : array[(array.length) /2];
	}
	public static int mode( int [] count) {
		int first = 0, firstIndex = 0;
		for( int k = 0; k < count.length; k++) {
			if(count[k] > 0 && first < count[k]) {
				first = count[k];
			}
		}
		
		int [] temp = {-4001, -4001};
		for( int k = 0; k < count.length; k++) {
			if(count[k] > 0 && count[k] == first) {
				if(temp[0] != -4001) {
					firstIndex = k - 4000;
					temp[1] = firstIndex;
					break;
				}
				firstIndex = k - 4000;
				temp[0] = firstIndex; 
			}
		}
		if(temp[1] == -4001 ) temp[1] = temp[0];
		Arrays.sort(temp);
		return temp[1];
	}
	
	public static int range(int [] array) {
		return array[array.length-1] - array[0];
	}
	
	
	
}
