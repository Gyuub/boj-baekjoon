package gyub.backjoon.sort;

import java.util.Scanner;

public class QuickSortMain {

	public static void main(String [] args) {
		int [] array;
		
		Scanner scan = new Scanner(System.in);
		array = new int[scan.nextInt()];
		for(int i = 0 ; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		quickSort(array, 0, array.length-1);
		printArray(array);
		
	}
	
	public static void quickSort(int [] array, int start, int end) {
		if(start >= end) {
			return;
		}
		int key = start;
		int i = start + 1;
		int j = end;
		
		while ( i < j) {
			while(i <=end && array[key] >= array[i]) {
				i++;
			}
			
			while(j > start && array[key] <= array[j]) {
				j--;
			}
			
			if( i > j ) {
				swap(array, key, j);
			}else{
				swap(array, i, j);
			}
		}
		
		quickSort(array, start, j-1);
		quickSort(array, j+1, end);
	}
	
	public static void swap(int [] array, int firstIDX, int secondIDX) {
		int temp = array[firstIDX];
		array[firstIDX] = array[secondIDX];
		array[secondIDX] = temp;
	}
	
	public static void printArray(int [] array) {
		for(int i : array) {
			System.out.println(i);
		}
	}
}
