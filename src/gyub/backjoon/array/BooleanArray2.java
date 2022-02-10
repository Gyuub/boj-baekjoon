package gyub.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BooleanArray2 {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			int size = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < size; i++) {
				String str = br.readLine();
				int sum = 0, num= 0;
				
				for(int j = 0; j < str.length(); j++) {
					if( str.charAt(j) == 'O') {
						num++;
					}else {
						sum += (num * (num+1) /2);
						num = 0;
					}
					
					if( j == str.length()-1) sum += (num * (num+1) /2);
				}
				sb.append(sum).append("\n");
			}
			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
