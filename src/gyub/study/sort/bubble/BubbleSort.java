package gyub.study.sort.bubble;

import gyub.study.sort.GyubSort;
import gyub.study.common.CommonUtil;

public class BubbleSort implements GyubSort {

	public static void sort2(int [] arr, int endIDX) {
		if( endIDX > -1) {
			for(int compareIDX = 0; compareIDX < endIDX; compareIDX++) {
				if(arr[compareIDX] > arr[compareIDX+1]) {
					CommonUtil.swap(arr, compareIDX, compareIDX+1);
				}
			}
			sort2(arr, endIDX--);
		}
	}
	
	public void sort(int [] arr) {
		for(int idx = arr.length -1 ; idx > -1; idx--) {
			for(int compareIDX = 0; compareIDX < idx; compareIDX++) {
				if(arr[compareIDX] > arr[compareIDX+1]) {
					CommonUtil.swap(arr, compareIDX, compareIDX+1);
				}
			}
		}
		
	}
	
}
