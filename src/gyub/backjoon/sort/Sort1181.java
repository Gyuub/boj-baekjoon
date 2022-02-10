package gyub.backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Sort1181 {

	public static void main (String [] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(br.readLine());
			String [] array = new String[size];
			for( int i = 0 ; i < size; i ++) {
				array[i] = br.readLine();
			}
			
			Arrays.sort(array, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					if(o1.length() == o2.length()) return o1.compareTo(o2);
					else return o1.length() - o2.length();
				}
			});
			
			printArray(array);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void printArray(String [] array) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < array.length; i ++) {
			if(i > 0 && array[i].hashCode() == array[i-1].hashCode()) continue; 
			sb.append(array[i]).append("\n");
		}
		System.out.println(sb);
	}
	
}
