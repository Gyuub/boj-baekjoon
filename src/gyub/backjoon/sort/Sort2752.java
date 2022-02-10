package gyub.backjoon.sort;

import java.util.Scanner;

/**
 * 정렬 2752 문제
 * @author Hman
 *
 */
public class Sort2752 {

	public static void main (String [] args) {
		int [] arr = new int[3];
		
		Scanner scan = new Scanner(System.in) ;
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		sort2(arr, 0);
		printArray(arr);
		
	}
	
	public static void sort(int [] arr) {
		for ( int selectIDX = 0; selectIDX < arr.length; selectIDX++) {
			int minValue = arr[selectIDX] < 1000001 ?  arr[selectIDX] : 1000001;
			int index = selectIDX;
			
			for( int compareIDX = selectIDX+1; compareIDX < arr.length; compareIDX++) {
				if( minValue > arr[compareIDX]) {
					minValue = arr[compareIDX];
					index = compareIDX;
				}
			}
			swap(arr, selectIDX, index);
		}
	}
	
	public static void sort2(int [] arr, int selectIDX) {
		if(selectIDX < arr.length) {
			int minValue = arr[selectIDX] < 1000001 ?  arr[selectIDX] : 1000001;
			int index = selectIDX;
			
			for( int compareIDX = selectIDX+1; compareIDX < arr.length; compareIDX++) {
				if( minValue > arr[compareIDX]) {
					minValue = arr[compareIDX];
					index = compareIDX;
				}
			}
			swap(arr, selectIDX, index);
			sort2(arr, ++selectIDX);
		}
	}
	
	
	public static void swap(int [] arr, int firstIDX, int secondIDX) {
		int temp = arr[firstIDX];
		arr[firstIDX] = arr[secondIDX];
		arr[secondIDX] = temp;
	}
	
	public static void printArray(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
