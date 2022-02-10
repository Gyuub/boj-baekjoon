package gyub.backjoon.sort;

import java.util.Scanner;

/**
 * 정렬 2750 문제
 * @author Hman
 *
 */
public class Sort2750 {

	public static void main(String [] args) {
		int [] array;
		
		
		Scanner scan = new Scanner(System.in);
		array = new int[scan.nextInt()];
		for(int i = 0 ; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		//selectionSort(array);
		//bubbleSort(array);
		//insertionSort(array);
		quickSort(array, 0, array.length-1);
		printArray(array);
		
		
	}
	
	public static void selectionSort(int [] array) {
		int i, j, min, index;
		for(i = 0; i < array.length; i ++){
			min =1001;
			index = i;
			
			for( j = i; j < array.length; j++) {
				if(min > array[j]) {
					min = array[j];
					index = j;
				}
			}
			swap(array, i, index);
		}
	}
	
	public static void bubbleSort(int [] array) {
		int i, j;
		for(i = array.length-1; i < array.length; i --){
			for(j = 0; j < i; j++) {
				if(array[j] > array[j+1]) {
					swap(array, j, j+1);
				};
			}
		}
	}
	public static void insertionSort(int [] array) {
		int i, j;
		for(i = 0; i < array.length; i ++){
			for(j = i; j > 0; j--) {
				if(array[j-1] > array[j]) {
					swap(array, j-1, j);
				};
			}
		}
	}
	
	public static void quickSort(int [] array, int start, int end) {
		int i, j, pivot ;
		if(start >= end) {
			return;
		}
		
		pivot = start;
		i = start +1;
		j = end;
		while(i<=j) {
			while(i <= end && array[pivot] >= array[i]) {
				i++;
			}
			
			while(j > start && array[pivot] <= array[j]) {
				j--;
			}
			
			if(i<j) {
				swap(array, i, j);
			}else {
				swap(array, pivot, j);
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
