package gyub.backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Description : 클래스에 대한 설명을 입력해주세요.<br>
 * Date : 2021. 8. 26.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 8. 26., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class Sort10814 {

	public static void main(String[] args) {
		// 첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb = new StringBuffer();
			
			int size = Integer.parseInt(br.readLine());
			String [][] array = new String [size][2];
			
			
			for(int i = 0 ; i < size; i++) {
				array[i] = br.readLine().split(" ");
			}
			
			Arrays.sort(array, new Comparator<String[]>() {
				@Override
				public int compare(String[] o1, String[] o2) {
					int m	 = Integer.parseInt(o1[0]);
					int k = Integer.parseInt(o2[0]);
					
					if(m > k ) return 1;
					else if(m == k ) return 0;
					else return -1;
				}
			});
			
			for(int i = 0 ; i < size; i++) {
				sb.append(array[i][0]).append( " ").append(array[i][1]).append("\n");
			}
			
			System.out.println(sb);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
