package gyub.backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort10989 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb = new StringBuffer();
			
			int size = Integer.parseInt(br.readLine());
			int [] count = new int[10000];
			
			for(int i = 0; i < size; i++) {
				int num = Integer.parseInt(br.readLine());
				if( num < 10001) count[num -1 ]++;
			}
			
			for(int i = 0; i < count.length; i ++) {
				for(int j = 0; j < count[i]; j++) {
					sb.append(i+1).append("\n");
				}
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
	
	public static void prinatArray(int [] array) {
		
		
		for( int i = 0 ; i < array.length; i++) {
			
		}
	}

}
