package gyub.backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSort {
	static int [] temp = new int[1000001];
	public static void main(String [] args) {
		int [] array;
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //����
			int size = Integer.parseInt(bf.readLine()); //Int
			
			array = new int[size];
			for(int i = 0 ; i < array.length; i++) {
				array[i] = Integer.parseInt(bf.readLine());
			}
			sort(array, 0, array.length-1); 
			printArray(array);
		} catch (Exception e) {
			
		}
		
		
	}
	
	public static void merge(int [] array, int start, int middle, int end) {
		
		int i = start;
		int j = middle+1;
		int key = start;
		
		while(i <= middle  && j <= end) {
			if( array[i] < array[j] ) {
				temp[key] = array[i];
				i++;
			}else {
				temp[key] = array[j];
				j++;
			}
			key++;
		}
		
		while( i <= middle) {
			temp[key] = array[i];
			i++;
			key++;
		}
		
		while( j <= end) {
			temp[key] = array[j];
			j++;
			key++;
		}
		
		for( int m = start; m <= end; m++) {
			array[m] = temp[m];
		}
	}
	
	public static void sort(int [] array, int start, int end) {
		if( start >= end) return;
		
		int mid = (start + end )/ 2;
		sort(array, start, mid);
		sort(array, mid+1, end);
		merge(array, start, mid, end);
	}
	
	public static void swap(int [] array, int firstIDX, int secondIDX) {
		int temp = array[firstIDX];
		array[firstIDX] = array[secondIDX];
		array[secondIDX] = temp;
	}
	
	public static void printArray(int [] array) throws IOException {
		StringBuilder sb = new StringBuilder();
		for(int i : array) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
	

}
