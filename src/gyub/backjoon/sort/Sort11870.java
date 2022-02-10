package gyub.backjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Description : 정렬. 좌표압축<br>
 * Date : 2021. 8. 28.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 8. 28., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Sort11870 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb = new StringBuffer();
			int size = Integer.parseInt(br.readLine());
			int [] array = new int[size];
			int [] sortArray = new int[size];
			String [] str = br.readLine().split(" ");
			
			for(int i = 0 ; i < size; i++) {
				array[i] =Integer.parseInt(str[i]);
				sortArray[i] =Integer.parseInt(str[i]);
			}
			
			Arrays.sort(sortArray);
			HashMap < Integer, Integer> map = new HashMap<Integer, Integer>();
			int j = 0 ;
			for(int k = 0 ; k < sortArray.length; k ++) {
				if(map.get(sortArray[k]) == null) {
					map.put(sortArray[k], j);
					j++;
				}
			}
			
			for(int i = 0; i < array.length; i ++) {
				sb.append(map.get(array[i])).append(" ");
			}
			
			System.out.println(sb);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
	}

}
