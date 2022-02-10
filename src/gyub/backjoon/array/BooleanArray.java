package gyub.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BooleanArray {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
			int size = Integer.parseInt(br.readLine());
			String [] array = new String [size];
			int [] temp = new int[size];
			
			for(int i = 0; i < size; i++) {
				array[i] = br.readLine();
			}
			
			calculatorByCharacter(array, temp);
			printArray(temp);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void calculatorByCharacter(String [] array, int [] temp) {
		int size = array.length;
		
		for(int i = 0; i < size; i++ ) {
			String [] str = array[i].split("");
			int sum = 0; 
			int num= 0;
			
			for(int j = 0 ; j < str.length; j++) {
				if( str[j].equals("O")) {
					num++;
				}else {
					sum += (num * (num+1) /2);
					num = 0;
				}
				if( j == str.length-1) sum += (num * (num+1) /2);
			}
			temp[i] = sum;
		}
	}
	
	
	
	public static void printArray(int [] array) throws IOException {
		StringBuilder sb = new StringBuilder();
		for(int i : array) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
	
}
