package gyub.backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String [] array = br.readLine().split("");
			int size = array.length;
			for(int i = 0; i < size; i ++) {
				
				for(int j = i; j < size ; j ++) {
					if(Integer.parseInt(array[i]) < Integer.parseInt(array[j])) {
						swap(array, i, j);
					}
				}
			}
			printArray(array);
	}
	
	public static void swap(String [] array, int idx1, int idx2) {
		String temp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = temp; 
	}
	
	public static void printArray(String [] array) throws IOException {
		StringBuilder sb = new StringBuilder();
		for(String c : array) {
			sb.append(c);
		}
		System.out.println(sb);
	}
	

}
