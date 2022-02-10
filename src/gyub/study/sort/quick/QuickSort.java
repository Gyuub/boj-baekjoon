package gyub.study.sort.quick;


import gyub.study.common.CommonUtil;
import gyub.study.sort.GyubSort;

public class QuickSort implements GyubSort {

	public void sort (int [] arr) {
		sort(arr, 0, arr.length-1);
	}
	private void sort (int [] arr, int start, int end) {
		if(start >= end) {
			return;
		}
		
		int key = start;
		int maxIDX = start+1;
		int minIDX = end;
		
		
		while(maxIDX <= minIDX) {
			while(maxIDX <= end && arr[key] >= arr[maxIDX]) {
				maxIDX++;
			}
			
			while(minIDX > start && arr[key] <= arr[minIDX] ) {
				minIDX--;
			}
			
			if( maxIDX > minIDX) {
				CommonUtil.swap(arr, start, minIDX);
				//CommonUtil.printArray(arr);
			}else {
				CommonUtil.swap(arr, maxIDX, minIDX);
				//CommonUtil.printArray(arr);
			}
		}
		sort(arr, start, minIDX-1);
		sort(arr, minIDX+1, end);
		
	}
}
